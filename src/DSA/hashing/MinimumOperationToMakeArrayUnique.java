package DSA.hashing;
/*
Given an array arr[ ] of N elements, your task is to find the minimum number of increment operations required to make all the elements of the array unique. ie- no value in the array should occur more than once. In an operation a value can be incremented by 1 only.

Example 1:

Input:
N = 3
arr[] = {1, 2, 2}
Output:
1
Explanation:
If we increase arr[2] by 1 then the resulting
array becomes {1, 2, 3} and has all unique values.
Hence, the answer is 1 in this case.
Example 2:

Input:
N = 4
arr[] = {1, 1, 2, 3}
Output:
3
Explanation:
If we increase arr[0] by 3, then all array
elements will be unique. Hence, the answer
is 3 in this case.
Your Task:
You dont need to read input or print anything. Complete the function minIncrements() which takes the array arr[ ] and its size N as the input parameters, and returns the minimum increment operations required to make all elements of the array unique.

Expected Time Complexity: O(N*log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ arr[i] ≤ 109


 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MinimumOperationToMakeArrayUnique {

    private static long minIncrements(int[] arr, int N) {
        // Code here
        int ans=0;
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<N;i++){
            tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
            s.add(arr[i]);
        }
        int key,fq,moveCount,mxMove=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> m : tm.entrySet()){
            fq=m.getValue();
            key = m.getKey();
            moveCount = Math.max(key+1,mxMove);
            while(fq>1){
                if(!s.contains(moveCount)){
                    ans +=(moveCount-key);
                    s.add(moveCount);
                    fq--;
                    mxMove=moveCount;
                }
                else{
                    moveCount++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4 ,5 ,4 ,1 ,3 ,7 ,6 ,3 ,3};
        System.out.println(minIncrements(arr,arr.length));
    }
}
