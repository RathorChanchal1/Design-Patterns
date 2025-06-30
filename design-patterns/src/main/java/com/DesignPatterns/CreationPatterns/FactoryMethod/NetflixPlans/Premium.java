package com.DesignPatterns.CreationPatterns.FactoryMethod.NetflixPlans;

public class Premium extends NetflixPlan {

    @Override
    int getPrice(){
        price = 999;
        return price;
    }
    
}
