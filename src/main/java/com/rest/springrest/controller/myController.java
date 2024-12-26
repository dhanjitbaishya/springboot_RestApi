package com.rest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springrest.entities.Courses;
import com.rest.springrest.services.CourseService;
@RestController


public class myController {
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application";
	}
	
	//get courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseService.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		
		return this.courseService.addCourse(courses);
	}
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses courses) {
		return this.courseService.updateCourse(courses);
	}
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
