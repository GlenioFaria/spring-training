package com.cydeo.controller;


import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // => @Controller + @ResponseBody
//@Controller
@RequestMapping("/courses/api/v1")// => good practice put /api/v1
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    //@ResponseBody
    public List<CourseDTO> getAllCourse(){

        return courseService.getCourses();
    }

    @GetMapping("{id}"   )
    //@ResponseBody
    public CourseDTO getCourseById(@PathVariable("id") long courseId){


       return courseService.getCourseById(courseId) ;

    }
    @GetMapping("category/{name}")
    //@ResponseBody
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){

        return courseService.getCoursesByCategory(category);
    }
    @PostMapping
    //@ResponseBody            // RequestBody bring wherever you put in Body with POST in Postman
    public CourseDTO createCourse(@RequestBody CourseDTO course){
        return courseService.createCourse(course);

    }
    @PutMapping("{id}") // Update
    //@ResponseBody
    public void updateCourse(@PathVariable("id") long courseId,@RequestBody CourseDTO course){
        courseService.updateCourse(courseId,course);

    }

    @DeleteMapping("{id}")
    //@ResponseBody
    public void deleteCourseById(@PathVariable("id") long courseId){
        courseService.deleteCourseById(courseId);

    }


}
