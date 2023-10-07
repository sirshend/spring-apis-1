package org.sirshendu.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceJPA {

    @Autowired
    private TopicServiceInterfaceJPA newData;
    //private List<Topic> newTopic= new ArrayList<>(Arrays.asList(new Topic("a","b","c"), new Topic("d","e","f")));


    public List<Topic> getAllTopics(){

        //return newTopic;
        List<Topic> newTopic=new ArrayList<>();
        newData.findAll()
                .forEach(newTopic::add);
        return newTopic;

    }

    public Optional<Topic> getTopic(String id){
//        for (Topic t: newTopic)
//        {
//            if (t.getId().equals(id))
//            {
//                return t;
//            }
//        }
//        return null;

        return newData.findById("id");


    }

    public void addTopic(Topic t){

        newData.save(t);
    }


    public void updateTopic(Topic t, String id) {
//        int j=0;
//        for (Topic i: newTopic)
//        {
//            //j++;
//            if (i.getId().equals(id))
//            {
//                newTopic.set(j, t);
//                return;
//            }
//            j++;
//        }
        newData.save(t);
        //return null;
    }

    public void deleteTopic(String id)
    {

        //newTopic.removeIf(t -> t.getId().equals(id));
        newData.deleteById(id);
    }


}
