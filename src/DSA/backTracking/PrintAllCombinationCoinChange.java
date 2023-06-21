package DSA.backTracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllCombinationCoinChange {
    List<Integer> l = new ArrayList<>();
    private void solve(int[] coins,int j,int amount){
        if(amount<0 || j>=coins.length){
            return;
        }
        if(amount==0){
            System.out.println(l);
            return;
        }
        if(coins[j]<=amount){
            l.add(coins[j]);
            solve(coins,j,amount-coins[j]);
            l.remove(l.size()-1);
        }
        solve(coins,j+1,amount);
        return;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int m= 5;
        PrintAllCombinationCoinChange printAllCombinationCoinChange = new PrintAllCombinationCoinChange();
        printAllCombinationCoinChange.solve(arr,0,m);
    }
}
