package spring.cloud.application.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by subashparida on 28/04/18.
 */
public interface TopicRepository extends CrudRepository<Topic, String> {
}
