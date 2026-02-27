package tn.esprit.ghaithbennasr4ds9.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Piste {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String namePiste;
    private  int length;
    private int slope;


    @Enumerated(EnumType.STRING)
    private Color color;

    @ManyToMany(mappedBy = "pistes", cascade = CascadeType.ALL)
    private Set<Skier> skiers;

}
