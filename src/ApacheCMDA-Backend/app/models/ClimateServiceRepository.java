/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface ClimateServiceRepository extends CrudRepository<ClimateService, Long> {
	List<ClimateService> findAllByName(String name);
	ClimateService findFirstByName(String oldName);
    List<ClimateService> findByOrderByCreateTimeDesc();
    ClimateService findById(long id);
    
	// select c.*, sum(s.count) as totalcount from ClimateService c, ServiceEntry s where c.id=s.serviceId group by s.serviceId order by totalcount desc;
	@Query(value = "select c.* from ClimateService c, ServiceEntry s where c.id=s.serviceId group by s.serviceId order by sum(s.count) desc", nativeQuery = true)
	List<ClimateService> getClimateServiceOrderByCount();

	@Query(value = "select c.* from ClimateService c, ServiceEntry s where c.id=s.serviceId group by s.serviceId order by s.latestAccessTimeStamp desc", nativeQuery = true)
	List<ClimateService> getClimateServiceOrderByLatestAccessTime();

	@Query(value = "select c.* from ClimateService c where c.name = :serviceName and c.versionNo = :versionNo", nativeQuery = true)
	List<ClimateService> getEntryByNameAndVersionNo(@Param("serviceName") String serviceName, @Param("versionNo") String versionNo);
	
	@Transactional
	@Modifying
	@Query("UPDATE ClimateService c SET c.avgScore = :avgScore, c.voteCount = :voteCount WHERE c.id = :id")
	Integer setAvgScoreAndVoteCountForId(@Param("avgScore") double avgScore, @Param("voteCount") int voteCount,
			  								@Param("id") long id);
	
	@Query(value = "select c.* from ClimateService c where c.name like ?1", nativeQuery = true)
	List<ClimateService> getClimateServiceByKeyWord(String key);
	
//	@Query(value = "select c.* from ClimateService c where c.name like ?1", nativeQuery = true)
//	List<ClimateService> getTop
	
}
