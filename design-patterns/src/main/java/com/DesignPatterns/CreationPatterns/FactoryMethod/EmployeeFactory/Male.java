package com.DesignPatterns.CreationPatterns.FactoryMethod.EmployeeFactory;

public class Male extends Person{
    Male(String name){
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
