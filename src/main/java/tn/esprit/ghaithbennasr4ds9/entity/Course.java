package tn.esprit.ghaithbennasr4ds9.entity;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;
    private int level;
    private float price;
    private int timeSlot;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
    private Support support;





    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Registration> registrations;


}
