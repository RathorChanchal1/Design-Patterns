package com.DesignPatterns.CreationPatterns.FactoryMethod.NetflixPlans;

public class NetflixPlanFactory {
    public NetflixPlan getPlan(String plan){
        if(plan==null){
            return null;
        }else if("basic".equalsIgnoreCase(plan)){
            return new Basic();
        }else if("standard".equalsIgnoreCase(plan)){
            return new Standard();
        }else if("premium".equalsIgnoreCase(plan)){
            return new Premium();
        }else{
            return null;
        }
    }
}
