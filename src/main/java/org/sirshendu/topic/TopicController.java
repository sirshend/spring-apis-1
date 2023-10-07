package org.sirshendu.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {

    @Autowired
    private TopicServiceJPA topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopicById(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/topics")
    public String addTopic(@RequestBody Topic t){
        topicService.addTopic(t);
        return "Well your topic has been added successfully";
    }

    @RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
    public String updateTopic(@RequestBody Topic t, @PathVariable String id){
        topicService.updateTopic(t,id);
        return "Updated successfully";
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics/{id}")
    public List<Topic> deleteTopicById(@PathVariable String id){
        topicService.deleteTopic(id);
        return topicService.getAllTopics();
    }


}
