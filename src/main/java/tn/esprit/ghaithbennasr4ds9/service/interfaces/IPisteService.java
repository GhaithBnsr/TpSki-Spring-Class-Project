package tn.esprit.ghaithbennasr4ds9.service.interfaces;

import tn.esprit.ghaithbennasr4ds9.entity.Piste;

import java.util.List;

public interface IPisteService {


    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    void deletePiste(Long id);
    Piste getPisteById(Long id);
    List<Piste> getAllPistes();



}
