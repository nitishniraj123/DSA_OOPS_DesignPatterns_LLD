public class Test5 {
    /*
    Given an array Arr[N]. Rotate the array by K units in the clock wise direction
Arr = [1,2,3, -1, 3,5]; k = 2
        3,5,1,2,3,-1

        for i=1 to k
        i=1;
        5,1,2,3,-1,3
        i=2;
        3,5,1,2,3,-1
        TC-O(k*n) = O(n2)

        1,2,3,-1,3,5

        n=6

        n-k elemnet from left side are shipted to right

        k element from right shifted to left

        n-k elemnt from left
        and k lement from right

        then reverse the whole array

        -1,3,2,1
        5,3
        3,5,1,2,3,-1
        O(n) =
     */

    private static void reverseArray(int[] arr ,int i,int j){
        int temp;
        while (i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    private static void getArrayAfterKRotationInClockwiseDirection(int[] arr , int k){
        reverseArray(arr,0,arr.length-k-1);
        reverseArray(arr, arr.length-k, arr.length-1);
        reverseArray(arr,0, arr.length-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3, -1, 3,5};
        int k = 8;
        k= k % arr.length;
        getArrayAfterKRotationInClockwiseDirection(arr,k);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
