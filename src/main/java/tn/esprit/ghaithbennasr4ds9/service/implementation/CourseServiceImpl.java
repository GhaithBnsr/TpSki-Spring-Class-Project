package tn.esprit.ghaithbennasr4ds9.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ghaithbennasr4ds9.entity.Course;
import tn.esprit.ghaithbennasr4ds9.repository.CourseRepository;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.ICourseService;

import java.util.List;


@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private  final CourseRepository courseRepository;

    @Override
    public Course addCourse(Course course) {

        return courseRepository.save(course);

    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {

        courseRepository.deleteById(id);

    }

    //todo
    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElseThrow(()-> new RuntimeException("Course not found with id: " + id));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
