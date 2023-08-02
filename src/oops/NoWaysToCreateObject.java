package oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoWaysToCreateObject {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        NoOfWaysCreateObjectInput obj1 = new NoOfWaysCreateObjectInput();
        obj1.setValue("using new keyboard "+" "+obj1);
        obj1.printValue();

        // Using newInstance() method from java.lang.reflect package
        NoOfWaysCreateObjectInput obj2 = NoOfWaysCreateObjectInput.class.newInstance();
        obj2.setValue("Using newInstance() method from java.lang.reflect package"+" "+obj2);
        obj2.printValue();

        // Using Class.forName() method
        NoOfWaysCreateObjectInput obj3 = (NoOfWaysCreateObjectInput) Class.forName("oops.NoOfWaysCreateObjectInput").newInstance();
        obj3.setValue("Using Class.forName() method"+" "+obj3);
        obj3.printValue();

        // Using factory method
        NoOfWaysCreateObjectInput obj4 = NoOfWaysCreateObjectInput.createInstance();
        obj4.setValue("Using factory method"+" "+obj4);
        obj4.printValue();

        // Using object cloning
        NoOfWaysCreateObjectInput obj5 = new NoOfWaysCreateObjectInput();
        NoOfWaysCreateObjectInput clonedObj = obj5.clone();
        clonedObj.setValue("Using object cloning"+" "+obj5);
        clonedObj.printValue();

        List<String> l = new ArrayList<>();
        Set<String>  s = new HashSet<>();
        l.add("nitish");
        l.add("nitish");
        System.out.println(l);
        s.addAll(l);
        System.out.println(s);
    }
}
