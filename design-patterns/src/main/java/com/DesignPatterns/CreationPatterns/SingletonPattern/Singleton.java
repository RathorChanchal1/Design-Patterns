package com.DesignPatterns.CreationPatterns.SingletonPattern;

public class Singleton {
    public static void main(String[] args) {
        LazySingletonFactory lazyObject1 = LazySingletonFactory.getInstance();
        System.out.println("Hashcode of lazyObject1: "+ lazyObject1.hashCode());

        LazySingletonFactory lazyObject2 = LazySingletonFactory.getInstance();
        System.out.println("Hashcode of lazyObject2: "+ lazyObject2.hashCode());

    }
}
