package tn.esprit.ghaithbennasr4ds9.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ghaithbennasr4ds9.entity.Instructor;
import tn.esprit.ghaithbennasr4ds9.repository.InstructorRepository;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.IInstructorService;

import java.util.List;


@Service
@AllArgsConstructor
public class InstructorServiceImpl implements IInstructorService {


    private  final InstructorRepository InstructorRepository;

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return InstructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public void deleteInstructor(Long id) {
        InstructorRepository.deleteById(id);
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return InstructorRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return InstructorRepository.findAll();
    }
}
