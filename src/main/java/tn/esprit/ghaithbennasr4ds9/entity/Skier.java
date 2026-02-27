package tn.esprit.ghaithbennasr4ds9.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> pistes;

    @OneToOne(cascade = CascadeType.ALL)
    private Subscription subscriptions;

    @OneToMany(mappedBy = "skier", cascade = CascadeType.ALL)
    private Set<Registration> registrations;


}
