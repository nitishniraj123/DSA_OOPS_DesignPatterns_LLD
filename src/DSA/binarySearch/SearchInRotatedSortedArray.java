package DSA.binarySearch;

public class SearchInRotatedSortedArray {
        private static int getIndex(int[] arr, int key){
            int l =0,h=arr.length-1,mid=-1;
            while(l<=h){
                mid = l +(h-l)/2;
                System.out.println(l+" "+mid+" "+h);
                if(arr[mid]==key){
                    return mid;
                }
                else {
                    if (arr[l] <= arr[mid]) {
                        if (key >= arr[l] && key <= arr[mid]) {
                            h = mid - 1;
                        } else {
                            l = mid + 1;
                        }
                    } else {
                        if (key >= arr[mid] && key <= arr[h]) {
                            l = mid+1;
                        } else {
                            h = mid-1;
                        }
                    }
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr= {9,8,7,6,5,4,3,2,1};
            int key = 1;
            System.out.println(getIndex(arr,key));
        }

}
