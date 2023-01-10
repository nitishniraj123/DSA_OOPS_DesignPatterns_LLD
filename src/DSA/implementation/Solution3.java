package DSA.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
    private static  List<List<Integer>> getConsecutiveSequence(int arr[],int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int i=0,start,j=0;
        while(i<n){
            start = arr[i];
            List<Integer> l = new ArrayList<>();
            while(i<n && arr[i]==start) {
                l.add(start);
                start++;
                i++;
            }
            if(!l.isEmpty()){
                ans.add(l);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {4, 189, 73, 2, 6, 188, 3, 1};
        System.out.println(getConsecutiveSequence(arr,arr.length));
    }
}
