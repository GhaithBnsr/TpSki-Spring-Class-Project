package tn.esprit.ghaithbennasr4ds9.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ghaithbennasr4ds9.entity.Subscription;
import tn.esprit.ghaithbennasr4ds9.repository.SubscriptionRepository;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.ISubscriptionService;

import java.util.List;


@Service
@AllArgsConstructor
public class SubscriptionServiceImpl implements ISubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription addSubscription(Subscription subscription) {

        return subscriptionRepository.save(subscription);

    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return null;
    }

    @Override
    public void deleteSubscription(Long id) {

        subscriptionRepository.deleteById(id);

    }

    //todo
    @Override
    public Subscription getSubscriptionById(Long id) {
        return subscriptionRepository.findById(id).orElseThrow(()-> new RuntimeException("Subscription not found with id: " + id));
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }
}

