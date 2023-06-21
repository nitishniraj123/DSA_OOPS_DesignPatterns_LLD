package DSA.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap<T> {

    List<T> l = new ArrayList<>();

    private int compareTo(T t1 , T t2){
        return 0;
    }
    private void syncBottomUp(int i){
        int parent = (i-1)/2;
    }

    private void syncTopDown(int i){
        int l =1;
    }

    private void add(T element){
        l.add(element);
        syncBottomUp(l.size());
    }

    private T  peek(){
        return l.get(0);
    }

    private T  poll(){
        T t = l.get(0);
        swap(0,l.size()-1);
        l.remove(l.size()-1);
        syncTopDown(0);
        return t;
    }

    private void swap(int i,int j){
        T temp = l.get(i);
        l.set(i,l.get(j));
        l.set(j,temp);
    }
    public static void main(String[] args) {
//        List<String> l = new ArrayList<>();
//        String s1 = "nitish";
//        String s2 = "niraj";
//        String s3 = "kumar";
//        l.add(s1);
//        l.add(s2);
//        l.add(s3);
//        System.out.println(l);
//        List<String> l1 = new ArrayList<>();
//        //l1.add("kumari");
//        l.removeAll(l1);
//        System.out.println(l1);
    }

}
