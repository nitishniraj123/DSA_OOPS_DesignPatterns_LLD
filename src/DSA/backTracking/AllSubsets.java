package DSA.backTracking;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {

    private static void allSubset(List<List<Integer>> ans, List<Integer> temp , int[] arr,int idx){
        if(idx > arr.length)
            return;
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            allSubset(ans,temp,arr,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] arr = {1,2,3};
        allSubset(ans,temp,arr,0);
        for (List l : ans){
            System.out.println(l);
        }
    }
}
