package com.DesignPatterns.CreationPatterns.SingletonPattern;

public class SingletonFactoryClass{

    /**
     * Important notes
     * 1) private constructor -> constrain to create object using constructor outside this class
     * 2) object create with the help of method: geInstance()
     * 3) static field to store object is private
     */

    private static SingletonFactoryClass singletonFactoryClass;

    private SingletonFactoryClass(){
    }

    // Lazy way of creating singleton object
    public static SingletonFactoryClass getInstance(){
        if(singletonFactoryClass==null){
            singletonFactoryClass = new SingletonFactoryClass();
        }
        return singletonFactoryClass;
    }
}