package tn.esprit.ghaithbennasr4ds9.entity;

import jakarta.persistence.*;


@Entity
public class Subscription {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSubscription;

}
