package tn.esprit.ghaithbennasr4ds9.service.interfaces;

import tn.esprit.ghaithbennasr4ds9.entity.Skier;

import java.util.List;


public interface ISkierService {

    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void deleteSkier(Long id);
    Skier getSkierById(Long id);
    List<Skier> getAllSkiers();

}

