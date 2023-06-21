package oops.mutabilityAndImmutability;

public final class MyImmutable {
    private final String name;

    public MyImmutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name){
//        this.name = name;
//    }
    public static void main(String[] args) {
        MyImmutable myImmutable = new MyImmutable("immutable hoo main");
        System.out.println(myImmutable.getName());
        //myImmutable.name="ab kya hua bhai";
        //System.out.println(myImmutable.getName());
    }
}
