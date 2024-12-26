package com.rest.springrest.services;

import java.util.List;

import com.rest.springrest.entities.Courses;
public interface CourseService {
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses courses);
	public Courses updateCourse(Courses courses);
	public void deleteCourse(long parseLong);
}
