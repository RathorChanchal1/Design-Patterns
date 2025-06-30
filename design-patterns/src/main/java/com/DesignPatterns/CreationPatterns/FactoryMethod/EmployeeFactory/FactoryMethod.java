package com.DesignPatterns.CreationPatterns.FactoryMethod.EmployeeFactory;

public class FactoryMethod {
    public static class EmpFactory{
        public static Person getEmp(String name, String gender){
            if(gender.equals("M")){
                return new Male(name);
            }else if(gender.equals("F")){
                return new Female(name);
            }
            return null;
        }

        public static void main(String[] args){
            Person man = EmpFactory.getEmp("Ajay", "M");
            System.out.println(man.getNameAndSolutation());

        }
    }
}