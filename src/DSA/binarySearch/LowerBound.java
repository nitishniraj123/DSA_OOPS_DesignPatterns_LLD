package DSA.binarySearch;

public class LowerBound {
    private static int getLowerBound(int[] arr,int key){
        int l =0,h=arr.length,mid;
        while (l<h){
            mid = l+(h-l)/2;
            if(key<=arr[mid]){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        if(l<arr.length && key>arr[arr.length-1]){
            l++;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr={2,3,3,4,4,5,6,7};
        int key = 8;
        System.out.println(getLowerBound(arr,key));
    }
}
