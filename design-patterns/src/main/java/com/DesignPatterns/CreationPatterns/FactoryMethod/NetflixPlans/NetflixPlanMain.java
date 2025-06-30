package com.DesignPatterns.CreationPatterns.FactoryMethod.NetflixPlans;

import java.util.Scanner;

public class NetflixPlanMain {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            NetflixPlanFactory planFactory = new NetflixPlanFactory();

            System.out.print("Which plan: basic/standard/premium: ");
            String planName = sc.nextLine();
            NetflixPlan plan = planFactory.getPlan(planName);

            System.out.println("your monthly price is: "+ plan.getPrice());
            System.out.println("your 1 year price is: "+ plan.getFinalAmount(12));
        }
    }
    
}
