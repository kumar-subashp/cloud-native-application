package spring.cloud.application.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subashparida on 28/04/18.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){

        List<Topic> result = new ArrayList<>();
        topicRepository.findAll()
                .forEach(result::add);
        return result;
    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic){

        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic){

        topicRepository.save(topic);
    }

    public void deleteTopic(Topic topic){
        topicRepository.delete(topic);
    }
}
