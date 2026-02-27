package tn.esprit.ghaithbennasr4ds9.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ghaithbennasr4ds9.entity.Skier;
import tn.esprit.ghaithbennasr4ds9.repository.SkierRepository;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.ISkierService;

import java.util.List;


@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierService {

    private final SkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {

        return skierRepository.save(skier);

    }

    @Override
    public Skier updateSkier(Skier skier) {
        return null;
    }

    @Override
    public void deleteSkier(Long id) {

        skierRepository.deleteById(id);

    }

    //todo
    @Override
    public Skier getSkierById(Long id) {
        return skierRepository.findById(id).orElseThrow(()-> new RuntimeException("Skier not found with id: " + id));
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepository.findAll();
    }
}

