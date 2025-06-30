package com.DesignPatterns.CreationPatterns.FactoryMethod.EmployeeFactory;

public class Female extends Person{
    Female(String name){
        super(name);
    }

    @Override
    String getSolutation(){
        return "Mrs./Miss";
    }

    @Override
    String getNameAndSolutation(){
        return this.getSolutation()+" "+ name;
    }
}
