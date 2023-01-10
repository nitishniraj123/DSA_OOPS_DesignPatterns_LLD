package DSA.implementation;

public class A {
    String name;
    String role;

    public A() {
    }

    public A(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "implementation.A{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static void main(String[] args) {
        A a1 = new A("nitish","sde");
        A a2 = a1;
        a2.setName("niraj");
        if(a1.equals(a2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
