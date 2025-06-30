package com.DesignPatterns.CreationPatterns.FactoryMethod.EmployeeFactory;

abstract class Person {
    protected String name;
    Person(String name){
        this.name = name;
    }
    abstract String getSolutation();
    abstract String getNameAndSolutation();
}
