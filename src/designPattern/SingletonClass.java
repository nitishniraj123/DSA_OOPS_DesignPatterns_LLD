package designPattern;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class SingletonClass {
    static String name;
    private static SingletonClass singletonClass = null;
    private SingletonClass(){
    }
    public static SingletonClass getSingletonClass(){
        if(singletonClass == null){
             synchronized (SingletonClass.class){
                 if(singletonClass == null) {
                     singletonClass = new SingletonClass();
                 }
            }
        }
        return singletonClass;
    }

    public void fun(){
        singletonClass.name = "nitish";
    }
    public void fun1(){
        singletonClass.name = "niraj";
    }
    public static void main(String[] args){
        SingletonClass obj1 = getSingletonClass();
        obj1.name="nitish";
        SingletonClass obj2 = null ;
        obj2=getSingletonClass();
        System.out.println(obj1.hashCode() + " "+obj2.hashCode());
        try {
            Constructor constructor = SingletonClass.class.getConstructor();
            constructor.setAccessible(true);
            obj2 = (SingletonClass) constructor.newInstance();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(obj1.name);
        System.out.println(obj1.hashCode() + " "+obj2.hashCode());
        Scanner sc = new Scanner(System.in);

    }
}
