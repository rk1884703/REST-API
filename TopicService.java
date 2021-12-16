package com.springbootquickstart.topics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String Id)
	{
		return topicRepo.findById(Id).orElse(new Topic());
	}
	
	public void addTopic(Topic topic)
	{
		topicRepo.save(topic);
	}
	
	public void updateTopic(Topic topic, String id)
	{
		topicRepo.save(topic);
	}
	public void deleteTopic(String id)
	{
		topicRepo.deleteById(id);
	}

}
