package tn.esprit.ghaithbennasr4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ghaithbennasr4ds9.entity.Instructor;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.IInstructorService;

import java.util.List;

@RestController
@RequestMapping("/api/instructor")
@AllArgsConstructor
public class InstructorController {

    IInstructorService instructorService;

    @PostMapping("/addInstructor")
    //in the following line the addInstructor method could be named anything like ajouterInstructor
    Instructor addInstructor(@RequestBody Instructor instructor){
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("/updateInstructor")
    Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/deleteInstructor/{id}")
    void deleteInstructor(@PathVariable Long id){
        instructorService.deleteInstructor(id);
    }

    @GetMapping("/getInstructorById/{id}")
    Instructor getInstructorById(@PathVariable Long id) {
        return instructorService.getInstructorById(id);
    }

    @GetMapping("/getAllInstructors")
    List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

}

