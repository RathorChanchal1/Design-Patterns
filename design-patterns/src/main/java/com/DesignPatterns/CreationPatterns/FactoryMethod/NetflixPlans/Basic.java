package com.DesignPatterns.CreationPatterns.FactoryMethod.NetflixPlans;

public class Basic extends NetflixPlan {

    @Override
    int getPrice(){
        price = 499;
        return price;
    }
}
