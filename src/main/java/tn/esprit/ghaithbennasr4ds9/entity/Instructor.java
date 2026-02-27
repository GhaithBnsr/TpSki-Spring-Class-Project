package tn.esprit.ghaithbennasr4ds9.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Instructor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;

    private String firstName;

    private String lastName;

    private LocalDate dateOfHire;


    @OneToMany(cascade =  CascadeType.ALL)
    private Set<Course> courses;



}
