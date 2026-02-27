package tn.esprit.ghaithbennasr4ds9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ghaithbennasr4ds9.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
