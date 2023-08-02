package oops;

import java.util.HashMap;

public class CustomHashSet<T> {

    private HashMap<Integer , T> hashMap = new HashMap<>();

    private  void add(T t){
        if(!hashMap.containsKey(t.hashCode())){
            hashMap.put(t.hashCode(),t);
        }
    }

    private void remove(T t){
        hashMap.remove(t.hashCode());
    }


    public static void main(String[] args) {
    CustomHashSet<String> customHashSet = new CustomHashSet<>();

    customHashSet.add("nitish");
    customHashSet.add("nitish");
    customHashSet.add("niraj");
    customHashSet.remove("niraj");

    CustomHashSet<Integer> customHashSet1 = new CustomHashSet<>();
    customHashSet1.add(1);
    customHashSet1.add(2);
    customHashSet1.add(3);
    customHashSet1.add(4);
    customHashSet1.add(4);
    //System.out.println("set1 type " + customHashSet.getClass() + " " +customHashSet);
    //System.out.println("set2 type " + customHashSet1.getClass() + " " +customHashSet1.toString());
    }
}
