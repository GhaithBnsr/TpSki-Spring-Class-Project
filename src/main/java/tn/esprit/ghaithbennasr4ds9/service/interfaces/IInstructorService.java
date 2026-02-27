package tn.esprit.ghaithbennasr4ds9.service.interfaces;

import tn.esprit.ghaithbennasr4ds9.entity.Instructor;

import java.util.List;

public interface IInstructorService {

    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long id);
    Instructor getInstructorById(Long id);
    List<Instructor> getAllInstructors();
}
