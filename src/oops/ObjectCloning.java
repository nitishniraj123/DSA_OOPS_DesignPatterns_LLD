package oops;

import java.util.Objects;

class ObjectCloning implements Cloneable {

    // declare variables
    String name;
    int version;

    int p;

    public ObjectCloning() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectCloning)) return false;
        ObjectCloning that = (ObjectCloning) o;
        return version == that.version && p == that.p && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version);
    }

    public static void main(String[] args) {

        // create an object of Main class
        ObjectCloning obj1 = new ObjectCloning();

        // initialize name and version using obj1
        obj1.name = "Java";
        obj1.version = 14;
        obj1.p=12;

        // print variable
        System.out.println(obj1.name);       // Java
        System.out.println(obj1.version);    // 14
        System.out.println(obj1.p);

        try {

            // create clone of obj1
            ObjectCloning obj2 = (ObjectCloning) obj1.clone();
            obj2.hashCode();
            System.out.println(obj1.hashCode());
            System.out.println(obj2.hashCode());
            // print the variables using obj2
            System.out.println(obj2.name);      // Java
            System.out.println(obj2.version);   // 14
            System.out.println(obj1.p);
            System.out.println(obj1.equals(obj2));
            obj2.name = "jms";
            obj2.p=5;
            System.out.println(obj2.name);
            System.out.println(obj1.name);
            System.out.println(obj1.p);
            System.out.println(obj2.p);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}