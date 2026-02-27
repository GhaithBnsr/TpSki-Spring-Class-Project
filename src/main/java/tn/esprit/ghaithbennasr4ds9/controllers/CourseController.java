package tn.esprit.ghaithbennasr4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ghaithbennasr4ds9.entity.Course;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.ICourseService;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
public class CourseController {

    ICourseService courseService;

    @PostMapping("/addCourse")

    //in the following line the addCouse method could be named anything like ajouterCours
    Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping("/updateCourse")
    Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse/{id}")
    void deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
    }

    @GetMapping("/getCourseById/{id}")
    Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @GetMapping("/getAllCourses")
    List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

}
