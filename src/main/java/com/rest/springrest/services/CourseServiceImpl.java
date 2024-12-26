package com.rest.springrest.services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rest.springrest.entities.Courses;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService {
	List<Courses> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Courses(1,"Java Core Course","This course contains content of Java"));
		list.add(new Courses(2,"Spring Boot Course","Creating RestApi using spring boot"));
		
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses c= null;
		for(Courses courses:list) {
			if(courses.getId()==courseId) {
				c=courses;
				break;
			}
		}
		
		return c;
	}
	@Override
	public Courses addCourse(Courses courses) {
		list.add(courses);
		return courses;
	}
	@Override
	public Courses updateCourse(Courses courses) {
		list.forEach(e -> {
			if(e.getId()==courses.getId()) {
				e.setTitle(courses.getTitle());
				e.setDescription(courses.getDescription());
			}
		});
		return courses;
	}
	@Override
	public void deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}

}
