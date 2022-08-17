package com.learnJavaeasily.From28mincourse;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
	@RequestMapping("/courses")
     public List<Courses> RetrieveAllCourses()
     {
		return Arrays.asList(
    			 new Courses(1, "Learn AWS", "in28min"),
    			 new Courses(2,"Learn Azure","in28min")
    			 );
     }
}
