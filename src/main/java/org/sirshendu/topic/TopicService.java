package org.sirshendu.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> newTopic= new ArrayList<>(Arrays.asList(new Topic("a","b","c"), new Topic("d","e","f")));
    public List<Topic> getAllTopics(){
        return newTopic;
    }

    public Topic getTopic(String id){
        for (Topic t: newTopic)
        {
            if (t.getId().equals(id))
            {
                return t;
            }
        }
        return null;
    }

    public void addTopic(Topic t){
        newTopic.add(t);
    }


    public void updateTopic(Topic t, String id) {
        int j=0;
        for (Topic i: newTopic)
        {
            //j++;
            if (i.getId().equals(id))
            {
                newTopic.set(j, t);
                return;
            }
            j++;
        }
        //return null;
    }

    public void deleteTopic(String id)
    {
        newTopic.removeIf(t -> t.getId().equals(id));
    }


}
