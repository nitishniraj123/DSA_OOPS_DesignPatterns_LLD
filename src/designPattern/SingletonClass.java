package designPattern;

import javax.swing.border.SoftBevelBorder;
import java.lang.reflect.Constructor;
import java.util.Scanner;

public class SingletonClass {
    private static SingletonClass singletonClass = null;
    private SingletonClass(){}
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

    public static void main(String[] args){
        SingletonClass obj1 = getSingletonClass();
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
        System.out.println(obj1.hashCode() + " "+obj2.hashCode());
        Scanner sc = new Scanner(System.in);

    }
}
