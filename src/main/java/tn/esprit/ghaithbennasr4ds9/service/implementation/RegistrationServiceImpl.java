package tn.esprit.ghaithbennasr4ds9.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ghaithbennasr4ds9.entity.Registration;
import tn.esprit.ghaithbennasr4ds9.repository.RegistrationRepository;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.IRegistrationService;

import java.util.List;


@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements IRegistrationService {

    private final RegistrationRepository registrationRepository;

    @Override
    public Registration addRegistration(Registration registration) {

        return registrationRepository.save(registration);

    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return null;
    }

    @Override
    public void deleteRegistration(Long id) {

        registrationRepository.deleteById(id);

    }

    //todo
    @Override
    public Registration getRegistrationById(Long id) {
        return registrationRepository.findById(id).orElseThrow(()-> new RuntimeException("Registration not found with id: " + id));
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }
}

