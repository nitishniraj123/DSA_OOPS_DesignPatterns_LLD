import java.util.*;

public class Test7 {
    private static String countFaultT(String s){

         return "sd";
    }

    private static long solve(int n , int m,List<Integer> price){
        Collections.sort(price);
        int i=0,x,y,c=m;
        while(c>0 && i<n){
            x = (int) (price.get(i)/Math.pow(2,c));
            if(x==0){
                i--;
                price.set(i,x);
                continue;
            }
            else
            if(i>0){
                y = (int) (price.get(i-1)/Math.pow(2,c));
                if(price.get(i-1)-y >= price.get(i)-x){
                    price.set(i-1,y);
                    i--;
                }
                else{
                   price.set(i,x);
                }
            }
            else {
                price.set(i,x);
            }
            c--;
        }
        long ans = 0;
        for (int p : price){
            ans +=p;
        }
        return ans;
    }
    public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
        System.out.println(solve(3,1,arr));
    }
}
