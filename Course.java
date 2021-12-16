package com.springbootquickstart.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springbootquickstart.topics.Topic;

@Entity
public class Course {
	
	@Id
	private String Id;
	private String Name;
	private String Description;
	
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {}
	
	public Course(String id, String name, String description, String topicId) {
		super();
		Id = id;
		Name = name;
		Description = description;
		topic = new Topic(topicId, "", "");
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
