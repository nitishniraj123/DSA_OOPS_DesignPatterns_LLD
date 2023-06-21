package designPattern;

import java.security.Signature;

public class XYZ {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println(singletonClass.name);
        singletonClass.fun();
        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();

        System.out.println(singletonClass1.name);
        singletonClass.fun1();
        SingletonClass singletonClass2 = SingletonClass.getSingletonClass();
        System.out.println(singletonClass2.name);
    }
}
