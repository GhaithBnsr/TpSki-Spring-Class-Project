package tn.esprit.ghaithbennasr4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ghaithbennasr4ds9.entity.Registration;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.IRegistrationService;

import java.util.List;

@RestController
@RequestMapping("/api/registration")
@AllArgsConstructor
public class RegistrationController {

    IRegistrationService registrationService;

    @PostMapping("/addRegistration")
    //in the following line the addRegistration method could be named anything like ajouterRegistration
    Registration addRegistration(@RequestBody Registration registration){
        return registrationService.addRegistration(registration);
    }

    @PutMapping("/updateRegistration")
    Registration updateRegistration(@RequestBody Registration registration){
        return registrationService.updateRegistration(registration);
    }

    @DeleteMapping("/deleteRegistration/{id}")
    void deleteRegistration(@PathVariable Long id){
        registrationService.deleteRegistration(id);
    }

    @GetMapping("/getRegistrationById/{id}")
    Registration getRegistrationById(@PathVariable Long id) {
        return registrationService.getRegistrationById(id);
    }

    @GetMapping("/getAllRegistrations")
    List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

}

