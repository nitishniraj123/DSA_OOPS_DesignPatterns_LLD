package DSA.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solutions {

    Map<Integer,Integer> mp ;
    List<Integer> l;
    int n=0;
    public Solutions() {
        mp=new HashMap<>();
        l=new ArrayList<>();
    }

    public boolean insert(int val) {
        if(mp.containsValue(val)){
            return false;
        }
        mp.put(val,n);
        l.add(val);
        n++;
        return true;
    }

    public boolean remove(int val) {
        if(!mp.containsValue(val)){
            return false;
        }
        int idx = mp.remove(val);
        l.set(idx,l.get(n-1));
        n--;
        return true;
    }

    public int getRandom() {
        return l.get((int)Math.random()%n);
    }

    public static void main(String[] args) {
        Solutions solutions;
        String[] words = {"RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"};
        int[] arr = {-2,1,2,2,-1,1,2,-1};
        for(String s : words){
            if(s.equalsIgnoreCase("RandomizedSet")){
                solutions=new Solutions();
            }
        }
    }
}
