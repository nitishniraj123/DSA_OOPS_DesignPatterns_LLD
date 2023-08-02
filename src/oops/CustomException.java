package oops;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CustomException  extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}

class CatchCustomException{
    List<String> remainingDeveloper = new ArrayList<>(Arrays.asList("manish","gaurav","rampal","shiv","dheeraj","payal","rohit","aditya","sonali"));

    public void checkRemainingDeveloper(String developer){
        if(remainingDeveloper.contains(developer)){
            System.out.print("developer exist after firing\n"+developer+"\n");
        }
        else{
            throw new CustomException("developer not exist due to firing");
        }
    }

    public static void main(String[] args) {
        CatchCustomException catchCustomException = new CatchCustomException();
        try {
            catchCustomException.checkRemainingDeveloper("gaur");
        }
        catch (CustomException customException){
            System.out.println(customException);
        }
        System.out.println("normal flow of code continue");
        //FileReader f = new FileReader("")
    }
}
