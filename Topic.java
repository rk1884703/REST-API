package com.springbootquickstart.topics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
	)
	@Column(name = "id")
	private String id;
	private String Name;
	private String Description;
	
	public Topic() {}
	
	public Topic(String TopicId, String name, String description) {
		super();
		id = TopicId;
		Name = name;
		Description = description;
	}
	
	public String getTopicId() {
		return id;
	}
	public void setTopicId(String TopicId) {
		id = TopicId;
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
