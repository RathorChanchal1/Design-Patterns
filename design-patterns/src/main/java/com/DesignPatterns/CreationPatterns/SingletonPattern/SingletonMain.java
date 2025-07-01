package com.DesignPatterns.CreationPatterns.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonMain {
    public static void main(String[] args) throws Exception, CloneNotSupportedException{

        //comparing hashcode of two diffecrent objects using lazy initialisation
        LazySingletonFactory lazyObject1 = LazySingletonFactory.getInstance();
        System.out.println("Hashcode of lazyObject1: "+ lazyObject1.hashCode());

        LazySingletonFactory lazyObject2 = LazySingletonFactory.getInstance();
        System.out.println("Hashcode of lazyObject2: "+ lazyObject2.hashCode());


        //comparing hashcode of two diffecrent objects using eager initialisation
        EagerSingletonFactory eagerObject1 = EagerSingletonFactory.getInstanse();
        System.out.println("Hashcode of eagerObject1: "+ eagerObject1.hashCode());

        EagerSingletonFactory eagerObject2 = EagerSingletonFactory.getInstanse();
        System.out.println("Hashcode of eagerObject2: "+ eagerObject2.hashCode());

        /**
         * Ways to break singleton pattern
         * 1) using reflection APIs
         * solution: 1-> if object is there then throw exception inside constructor
         *           2-> use enum
         * 2) using desirialization 
         * solution: Implement read resolve method
         * 3) cloning
         */

         
        try{
            //reflection API
            LazySingletonFactory obj1 = LazySingletonFactory.getInstance();
            System.out.println("referance of obj1: "+ obj1.hashCode());
    
            Constructor<?>[] constructors = LazySingletonFactory.class.getDeclaredConstructors();
            constructors[0].setAccessible(true);
            LazySingletonFactory obj2 = (LazySingletonFactory) constructors[0].newInstance();
            System.out.println("referance of obj2: "+ obj2.hashCode());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            //using enum class
            LazySingletonEnum obj3 = LazySingletonEnum.INSTANCE;
            System.out.println("referance of obj1: "+ obj3.hashCode());

            Constructor<?>[] constructors2 = LazySingletonEnum.class.getDeclaredConstructors();
            constructors2[0].setAccessible(true);
            LazySingletonEnum obj4 = (LazySingletonEnum) constructors2[0].newInstance();
            System.out.println("referance of obj2: "+ obj4.hashCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            //using desirialization
            LazySingletonFactory obj5 = LazySingletonFactory.getInstance();
            // Serialize to file
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
            oos.writeObject(obj5);

            // Deserialize from file
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
            LazySingletonFactory obj6 = (LazySingletonFactory) ois.readObject();

            System.out.println("serialization-deserialization------");
            System.out.println("hashcode for obje5: "+ obj5.hashCode());
            System.out.println("hashcode for obje6: "+ obj6.hashCode());

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            //using cloning 
            LazySingletonFactory obj = LazySingletonFactory.getInstance();
            System.out.println(obj.hashCode());
            LazySingletonFactory obj2 = (LazySingletonFactory)obj.clone();
            System.out.println(obj2.hashCode());
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
