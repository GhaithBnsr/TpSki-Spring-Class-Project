package tn.esprit.ghaithbennasr4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ghaithbennasr4ds9.entity.Skier;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.ISkierService;

import java.util.List;

@RestController
@RequestMapping("/api/skier")
@AllArgsConstructor
public class SkierController {

    ISkierService skierService;

    @PostMapping("/addSkier")
    //in the following line the addSkier method could be named anything like ajouterSkier
    Skier addSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }

    @PutMapping("/updateSkier")
    Skier updateSkier(@RequestBody Skier skier){
        return skierService.updateSkier(skier);
    }

    @DeleteMapping("/deleteSkier/{id}")
    void deleteSkier(@PathVariable Long id){
        skierService.deleteSkier(id);
    }

    @GetMapping("/getSkierById/{id}")
    Skier getSkierById(@PathVariable Long id) {
        return skierService.getSkierById(id);
    }

    @GetMapping("/getAllSkiers")
    List<Skier> getAllSkiers() {
        return skierService.getAllSkiers();
    }

}

