package tn.esprit.ghaithbennasr4ds9.service.interfaces;

import tn.esprit.ghaithbennasr4ds9.entity.Subscription;

import java.util.List;


public interface ISubscriptionService {

    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    void deleteSubscription(Long id);
    Subscription getSubscriptionById(Long id);
    List<Subscription> getAllSubscriptions();

}

