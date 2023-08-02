package oops;

import java.util.Objects;

public class NoOfWaysCreateObjectInput {
    private String value = "";

    public NoOfWaysCreateObjectInput() {
    }

    public void setValue(String objectCreationWays){
        this.value = objectCreationWays;
    }

    public void printValue(){
        System.out.println("object made using " +value);
    }

    public NoOfWaysCreateObjectInput clone(){
        NoOfWaysCreateObjectInput obj1 = new NoOfWaysCreateObjectInput();
        return obj1;
    }

    public static NoOfWaysCreateObjectInput createInstance(){
        return new NoOfWaysCreateObjectInput();
    }
}
