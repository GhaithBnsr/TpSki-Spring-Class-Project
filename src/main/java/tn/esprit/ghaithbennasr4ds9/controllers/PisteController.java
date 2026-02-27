package tn.esprit.ghaithbennasr4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ghaithbennasr4ds9.entity.Piste;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/api/piste")
@AllArgsConstructor
public class PisteController {

    IPisteService pisteService;

    @PostMapping("/addPiste")
    //in the following line the addPiste method could be named anything like ajouterPiste
    Piste addPiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }

    @PutMapping("/updatePiste")
    Piste updatePiste(@RequestBody Piste piste){
        return pisteService.updatePiste(piste);
    }

    @DeleteMapping("/deletePiste/{id}")
    void deletePiste(@PathVariable Long id){
        pisteService.deletePiste(id);
    }

    @GetMapping("/getPisteById/{id}")
    Piste getPisteById(@PathVariable Long id) {
        return pisteService.getPisteById(id);
    }

    @GetMapping("/getAllPistes")
    List<Piste> getAllPistes() {
        return pisteService.getAllPistes();
    }

}

