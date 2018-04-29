package spring.cloud.application.topic;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="topics", description="Topics supported operations")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @ApiOperation(value = "View a list of available topics", response = List.class)
    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    @ApiOperation(value = "Get a topic")
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id){

        return topicService.getTopic(id);
    }

    @ApiOperation(value = "Add a topic")
    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){

        topicService.addTopic(topic);
    }

    @ApiOperation(value = "Update a topic")
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic);
    }

    @ApiOperation(value = "Delete a topic")
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@RequestBody Topic topic, @PathVariable String id){

        topicService.deleteTopic(topic);
    }
}
