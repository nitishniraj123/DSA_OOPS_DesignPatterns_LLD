package DSA.binarySearch;

public class UpperBound {
    private static int getUpperBound(int[] arr, int key){
        int l =0,h=arr.length,mid;
        while (l<h){
            mid = l+(h-l)/2;
            if(key>=arr[mid]){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        if(l<arr.length && key>=arr[arr.length-1]){
            l++;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr={2,3,3,4,4,5,6,7};
        int key = 9;
        System.out.println(getUpperBound(arr,key));
    }
}
