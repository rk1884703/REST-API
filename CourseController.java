package com.springbootquickstart.courses;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootquickstart.topics.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId)
	{
		return courseservice.getAllCourses(topicId);
	}
	
	@RequestMapping("topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String topicId, @PathVariable String id)
	{
		return courseservice.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId, "", ""));
		courseservice.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
	public void updateTopic(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId, "", ""));
		courseservice.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		courseservice.deleteCourse(id);
	}
}
