package DSA.string;

import java.util.*;

public class STRING {
    private static class AlphaNum{
        String name;
        int count;

        public AlphaNum(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }
    public static void main(String[] args) {
        String [] arr = {"2234597891 zmxvvxbcij 8800654113 jihgfedcba",
                "1234567891 abcdefghij 9876543219 jihgfedcba",
                "2234597891 zmxvvxbcij 8800654113 jihgfedcba"};
        Map<String,Integer> mp = new HashMap<>();
        Arrays.sort(arr);
        for(String a : arr ){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        AlphaNum[] ans = new AlphaNum[mp.size()];
        int i=0;
        for(String s : arr){
            if(mp.containsKey(s)) {
                ans[i++] = new AlphaNum(s, mp.get(s).intValue());
                mp.remove(s);
            }
        }
        for(AlphaNum alphaNum : ans){
            System.out.println(alphaNum.name + ""+alphaNum.count);
        }

        String s = null;
        System.out.println(s.equalsIgnoreCase("sonali"));
    }
}
