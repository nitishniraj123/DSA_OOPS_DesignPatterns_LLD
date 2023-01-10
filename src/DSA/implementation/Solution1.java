package DSA.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution1 {
    private static void solve(List<List<Integer>> ans , List<Integer> temp, int n, int idx, int k){
        if(temp.size()==k){
            List<Integer> temp1 = new ArrayList<>(temp);
            ans.add(temp1);
            return;
        }
        for(int i=idx;i<=n;i++){
            temp.add(i);
            solve(ans,temp,n,i+1,k);
            temp.remove(Integer.valueOf(i));
        }
    }
    private static List<List<Integer>> combinations(int n, int k) {
        // add your logic here
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,temp,n,1,k);
        return ans;
    }
 static class C{
        int p;
}
    public static void main(String[] args) {
        System.out.println(combinations(4,2));
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");
        System.out.println(sb);
        sb.replace(1,3,"Java");
        // Now original string is changed
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        int a = 1;
        char c = (char)(a+'0');
        int b = c-'0';
        System.out.println(c + " "+b);
        char c1 = '5';
        char c2 = '4';
        if(Character.compare(c1,c2)>0){
            System.out.println(c1);
        }
        else{
            System.out.println(c2);
        }
        String s = String.valueOf(c1)+ String.valueOf(c2);
        System.out.println(s);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        int [] arr = {5,4,5};
        for(int a3 : arr){
            switch (a3){
                case 4:
                case 2:
                case 3:
                    System.out.println("thik hai");
                    break;
                default:
                    System.out.println("ye bhi thik hai");
            }
        }
        Integer p = null;
        System.out.println(String.valueOf(p));

        int[][] source = {{1,2,3},{2,3,4}};
        int[][] dest = Arrays.stream(source).map(a4-> Arrays.copyOf(a4,a4.length)).toArray(int[][] :: new);
        System.out.println(String.valueOf(dest));

        String s3 = "nitish";
        StringBuilder sb3 = new StringBuilder(s3);
        StringBuilder sb4 = new StringBuilder(sb3);
        //sb4.append(s3);
        sb3.setCharAt(0,'p');
        System.out.println(sb3 + " " +sb4);
        char[] c3 = s3.toCharArray();
        System.out.println(c3);
        Arrays.sort(c3);
        System.out.println(c3);
        System.out.println(s3);
        int[] arr1 = {1,2,3,4};
        int sum = Arrays.stream(arr1).reduce(0,(r,q)->r+q);
        System.out.println(sum);
        String s5 = "House NO -  634  Street NO -  6  , Area -  Brahmpuri panjaya   , City- Meerut Lanmdakr Near - Danish Ice Cream ( 100 Meter Away ) sonal mittal";
        String s6 = "Sonal mittal House NO -  634  Street NO -  6  , Area -  Brahmpuri panjaya   , City- Meerut Lanmdakr Near - Danish Ice Cream ( 100 Meter Away )";
        System.out.println(s5.length() + " " +s6.length());
        C v = new C();

    }
}