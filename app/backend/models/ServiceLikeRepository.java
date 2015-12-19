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


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

@Named
@Singleton
public interface ServiceLikeRepository extends CrudRepository<ServiceLike, Long> {
	ServiceLike findByUserAndService(User user, ClimateService climateService);
	
	@Query(value = "SELECT D.service_id AS service_id FROM "
	+ "(SELECT DISTINCT(B.user_id) AS common_uid FROM ServiceLike A, ServiceLike B WHERE A.user_id = :userID AND A.service_id = B.service_id AND A.user_id <> B.user_id) AS C, "
	+ " ServiceLike D WHERE C.common_uid = D.user_id AND D.service_id NOT IN (SELECT service_id FROM ServiceLike where user_id = :userID) "
	+ "GROUP BY (D.service_id) ORDER BY (COUNT(*)) DESC LIMIT 5 ", nativeQuery = true)
	List<Long> getRecommandServiceID(@Param("userID") long userID);
	
}