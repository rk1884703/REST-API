package com.springbootquickstart.courses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String Id)
	{
		return courseRepo.findById(Id).orElse(new Course());
	}
	
	public void addCourse(Course course)
	{
		courseRepo.save(course);
	}
	
	public void updateCourse(Course course)
	{
		courseRepo.save(course);
	}
	public void deleteCourse(String id)
	{
		courseRepo.deleteById(id);
	}

}
