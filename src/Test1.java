import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    private static  List<Integer>  getMaximumFromWindow(int[] arr , int k){
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[dq.peek()]<=arr[i]){
                dq.pollLast();
            }
            dq.add(i);
        }
        ans.add(arr[dq.peek()]);
        for(int i=k;i< arr.length;i++){
            while(!dq.isEmpty() && arr[dq.peek()]<=arr[i]){
                dq.pollLast();
            }
            while(!dq.isEmpty() && dq.peek()<=i-k){
                dq.poll();
            }
            dq.add(i);
            ans.add(arr[dq.peek()]);
        }
        return ans;
    }

    private static int getMaxEnergy(List<List<Integer>> lists ){
        int p,q,r=Integer.MAX_VALUE;
        for(int i=1;i<4;i++){
            for(int j=0;j<4;j++){
                p=i-1;
                q=j-1;
                r=Integer.MAX_VALUE;
                if(q>=0 && q<4){
                    r = Math.min(lists.get(p).get(q),r);
                }
                q=j+1;
                if(q>=0 && q<4){
                    r = Math.min(lists.get(p).get(q),r);
                }
                q=j;
                if(q>=0 && q<4){
                    r = Math.min(lists.get(p).get(q),r);
                }
                lists.get(i).set(j,(lists.get(i).get(j))+r);
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            ans = Math.max(ans , (100 - lists.get(3).get(i)));
        }
        return ans;
    }

    private static boolean possible(int n , long mid , List<Integer> burstTime){
        int sum = 0,c=0;
        for(int i : burstTime){
            sum+=i;
            if(sum>mid){
                sum=i;
                c++;
            }
        }
        if(sum>0){
            c++;
        }
        return c<=n;
    }
    private static  long solve3(int n , List<Integer>burstTime){
         long l= 1, r= (long) 1e18,mid,ans=Long.MAX_VALUE;
        while(l<=r){
            mid = l + (r-l)/2;
            if(possible(n,mid,burstTime)){
                ans = Math.min(mid,ans);
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        int[] arr= {5,4,8,2,7};
        int k = 3;
        //System.out.println(getMaximumFromWindow(arr,k));
        List<List<Integer>> lists = new ArrayList<>();
        int n = 3;
        List<Integer> burstTime = new ArrayList<>();
        burstTime.add(4);
        int x=1;
        for(int i=1;i<=128;i+=i){
            x+=x;
        }
        //System.out.println(x);
        burstTime.add(3);
        burstTime.add(2);
        burstTime.add(2);
        burstTime.add(2);
        burstTime.add(6);
        System.out.println(solve3(n,burstTime));



    }
}
