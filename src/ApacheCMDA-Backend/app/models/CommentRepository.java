package models;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface CommentRepository extends CrudRepository<Comment, Long> {
	//@Query(value = "select c.* from Comment c where c.serviceId like ?1", nativeQuery = true)
	//List<Comment> getCommentbyServiceID(String serviceID);
	List<Comment> findByServiceId(long serviceID);
}
