package DSA.array;

import java.util.*;

public class TripletCountAndGetUniqueElementFromSortedArray {
    static class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    private static void countTriplet(int[] arr ){
        Map<Integer,Pair> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                mp.put(arr[i]+arr[j],new Pair(arr[i],arr[j]));
            }
        }
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(-arr[i])){
                //System.out.println(arr[i]+" "+mp.get(-arr[i]).first + " "+mp.get(-arr[i]).second);
            }
        }
    }

    private static int solve1(int[] arr){
        int l = 0,r=arr.length-1,mid,ans=0;
        while(l<=r){
            mid = l+(r-l)/2;
            if((mid>0 && arr[mid]!=arr[mid-1])&&(mid<arr.length-1 && arr[mid]!=arr[mid+1])){
                ans = arr[mid];
                break;
            }
            if(mid%2==0){
                r=mid-1;
            }
            else{
                l= mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(5);
        Iterator<Integer> itr = l.listIterator();
        while (itr.hasNext()){
            //System.out.println(itr.next());
            itr.next();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.offer(4);
        //System.out.println(pq.poll());
        //System.out.println(l);
        countTriplet(arr);
        int[] arr1 = {1,1,2,2,3,3,4,4,5};
        System.out.println(solve1(arr1));
    }
}
