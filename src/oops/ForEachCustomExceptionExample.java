package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachCustomExceptionExample {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add(null);
        numbers.add("2");
        numbers.add("6");
        numbers.add("4");
        String p = "3";
        //numbers.forEach(e->fun(e , p));
        if(numbers.stream().anyMatch(e-> e!= null && e.contains(p))) {
            throw new CustomException("chutiyap number:");
        }
     }

    public static void fun(String num , String p) throws CustomException {
        if (num.equalsIgnoreCase(p)) {
            throw new CustomException("chutiyap number: " + num);
        }
        System.out.println(num);
    }
}

class CustomException1 extends Exception {

    public CustomException1(String message) {
        super(message);
    }
}
