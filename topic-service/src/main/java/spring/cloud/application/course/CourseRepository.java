package spring.cloud.application.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by subashparida on 28/04/18.
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
