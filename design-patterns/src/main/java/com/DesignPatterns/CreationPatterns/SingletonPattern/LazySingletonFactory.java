package com.DesignPatterns.CreationPatterns.SingletonPattern;

import java.io.Serializable;

public class LazySingletonFactory implements Serializable, Cloneable {

    /**
     * Important notes
     * 1) private constructor -> constrain to create object using constructor outside this class
     * 2) object create with the help of method: geInstance()
     * 3) static field to store object is private
     * 
     * problem: this is not specific to threads if two threads calls at the same time then there is possibility that many objects can be created
     * solution: create syncronized block
     */

    private static LazySingletonFactory singletonObject;

    private LazySingletonFactory(){
        // protect from reflection API
        if(singletonObject!=null){
            throw new RuntimeException("you are trying to break singleton pattern.");
        }
    }

    // Lazy way of creating singleton object
    public static LazySingletonFactory getInstance(){
        if(singletonObject==null){
            synchronized(LazySingletonFactory.class){
                if(singletonObject==null){
                    singletonObject = new LazySingletonFactory();
                }
            }
        }
        return singletonObject;
    }

    //fix for desirialization initialization by implemention readResolve method
    public Object readResolve(){
        return singletonObject;
    }

    // // cloning 
    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }

    // cloning fix
    @Override
    public Object clone() throws CloneNotSupportedException{
        return singletonObject;
    }
}