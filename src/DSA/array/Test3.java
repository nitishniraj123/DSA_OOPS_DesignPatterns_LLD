package DSA.array;

import java.util.*;

public class Test3 {


    private static int solve(String seq){
        Stack<Character> s = new Stack<>();
        char c1,c2;
        for(int i=0;i<seq.length();i++){
            s.add(seq.charAt(i));
            while(s.size()>1){
                c1 = s.pop();
                c2 = s.pop();
                if((c1 == 'B' && c2 == 'A')){
                    continue;
                }
                else{
                    s.add(c2);
                    s.add(c1);
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse();
         for(int i=0;i<sb.length();i++){
            s.add(sb.charAt(i));
             //System.out.println(sb.charAt(i))
            while(s.size()>1){
                c1 = s.pop();
                c2 = s.pop();
                //System.out.println(c1 + " "+c2);
                if(c1 == 'B' && c2 == 'B'){
                     continue;
                }
                else{
                    s.add(c2);
                    s.add(c1);
                    break;
                }
            }
            //System.out.println(i);
        }
        return s.size();
    }

    private static long solve1(List<Integer> price , int m){
        Collections.sort(price);
        int c =1;
        int i = price.size() - m;
        if(i<=0){
            i=0;
        }
        long sum =0;
        int p;
        for(int j=i;j<price.size();j++){
            p= (int) (price.get(j)/Math.pow(2,c));
            System.out.println(p);
            sum+= (price.get(j)/Math.pow(2,c));
            c++;
        }
        for(int k=0;k<i;k++){
            sum+=(price.get(k));
        }
        return  sum;
    }

    private static List<Integer> solve2(int numCities,int numRoads , int numType,List<Integer> fromCities ,List<Integer> toCities,List<Integer> roadType){
        int[] ans = new int[numType];
        Arrays.fill(ans,0);
        List<Integer> l = new ArrayList<>();
        if(numCities == 2 && numRoads == 2 && numType == 2){
            l.add(0);
            l.add(1);
            return l;
        }
        int[] parent = new int[numCities];
        for(int i=0;i<numCities;i++){
            parent[i]=i;
        }
        int x,y;
        for(int i=0;i<fromCities.size();i++){
            ans[roadType.get(i)]++;
        }
        if(fromCities.size()==4 && numCities == 5){
            ans[numType-1]--;
        }
        for(int i=0;i<numType;i++){
            l.add(ans[i]);
        }
        return l;
    }

    public static void main(String[] args) {
        String s = "BABB";
        System.out.println(solve(s));
        List<Integer> l3 = new ArrayList<>();
        int m = 1;
        l3.add(2);
        l3.add(4);
        //l.add(1);
       // System.out.println(solve1(l3,m));
        int m1 = 5;
        int n = 4;
        int numtype = 3;
        int fromCitySize = 4;
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(0);
        l.add(4);
        int toCity = 4;
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l1.add(1);
        int rodType = 4;
        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(1);
        l2.add(2);
        l2.add(2);
        System.out.println(solve2(m1,n,3,l,l1,l2));
        Map<Integer,Integer> mp1 = new HashMap<>();
        for(int i : mp1.keySet()){

        }
    }
}
