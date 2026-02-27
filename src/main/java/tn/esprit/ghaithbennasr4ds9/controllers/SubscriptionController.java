package tn.esprit.ghaithbennasr4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ghaithbennasr4ds9.entity.Subscription;
import tn.esprit.ghaithbennasr4ds9.service.interfaces.ISubscriptionService;

import java.util.List;

@RestController
@RequestMapping("/api/subscription")
@AllArgsConstructor
public class SubscriptionController {

    ISubscriptionService subscriptionService;

    @PostMapping("/addSubscription")
    //in the following line the addSubscription method could be named anything like ajouterSubscription
    Subscription addSubscription(@RequestBody Subscription subscription){
        return subscriptionService.addSubscription(subscription);
    }

    @PutMapping("/updateSubscription")
    Subscription updateSubscription(@RequestBody Subscription subscription){
        return subscriptionService.updateSubscription(subscription);
    }

    @DeleteMapping("/deleteSubscription/{id}")
    void deleteSubscription(@PathVariable Long id){
        subscriptionService.deleteSubscription(id);
    }

    @GetMapping("/getSubscriptionById/{id}")
    Subscription getSubscriptionById(@PathVariable Long id) {
        return subscriptionService.getSubscriptionById(id);
    }

    @GetMapping("/getAllSubscriptions")
    List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

}

