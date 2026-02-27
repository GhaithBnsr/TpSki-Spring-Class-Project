package tn.esprit.ghaithbennasr4ds9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ghaithbennasr4ds9.entity.Piste;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}
