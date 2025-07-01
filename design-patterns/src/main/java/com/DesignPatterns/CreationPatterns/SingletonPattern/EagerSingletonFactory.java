package com.DesignPatterns.CreationPatterns.SingletonPattern;

public class EagerSingletonFactory {

    //eager way of creating signleton object
    private static EagerSingletonFactory eagerSingletonFactory = new EagerSingletonFactory();

    private EagerSingletonFactory(){}

    public static EagerSingletonFactory getInstanse(){
        return eagerSingletonFactory;
    }

    /**
     * problem: even if there is no use of object we are still creating object in terms of space usage
     */


}
