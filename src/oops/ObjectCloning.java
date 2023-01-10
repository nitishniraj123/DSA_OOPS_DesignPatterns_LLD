package oops;

class ObjectCloning implements Cloneable {

    // declare variables
    String name;
    int version;

    public ObjectCloning() {
    }

    public static void main(String[] args) {

        // create an object of Main class
        ObjectCloning obj1 = new ObjectCloning();

        // initialize name and version using obj1
        obj1.name = "Java";
        obj1.version = 14;

        // print variable
        System.out.println(obj1.name);       // Java
        System.out.println(obj1.version);    // 14

        try {

            // create clone of obj1
            ObjectCloning obj2 = (ObjectCloning) obj1.clone();
            System.out.println(obj1.hashCode());
            System.out.println(obj2.hashCode());
            // print the variables using obj2
            System.out.println(obj2.name);      // Java
            System.out.println(obj2.version);   // 14
            System.out.println(obj1.equals(obj2));
            obj2.name = "jms";
            System.out.println(obj2.name);
            System.out.println(obj1.name);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}