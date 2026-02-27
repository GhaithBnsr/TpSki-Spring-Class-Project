package tn.esprit.ghaithbennasr4ds9.service.interfaces;

import tn.esprit.ghaithbennasr4ds9.entity.Registration;

import java.util.List;


public interface IRegistrationService {

    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    void deleteRegistration(Long id);
    Registration getRegistrationById(Long id);
    List<Registration> getAllRegistrations();

}

