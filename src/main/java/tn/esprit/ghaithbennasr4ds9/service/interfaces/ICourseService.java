package tn.esprit.ghaithbennasr4ds9.service.interfaces;

import tn.esprit.ghaithbennasr4ds9.entity.Course;

import java.util.List;


public interface ICourseService {

    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Long id);
    Course getCourseById(Long id);
    List<Course> getAllCourses();

}
