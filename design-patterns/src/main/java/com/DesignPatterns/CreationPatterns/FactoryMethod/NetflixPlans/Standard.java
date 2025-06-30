package com.DesignPatterns.CreationPatterns.FactoryMethod.NetflixPlans;

public class Standard extends NetflixPlan {
    
    @Override
    int getPrice(){
        price = 699;
        return price;
    }
}
