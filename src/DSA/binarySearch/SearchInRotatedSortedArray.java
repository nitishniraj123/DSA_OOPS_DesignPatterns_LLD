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

        private static int getUnique(int[] arr){
            int l = 0,r=arr.length-1,n=arr.length-1,mid=0;
            while (l<r){
                mid  = l+(r-l)/2;
                if((mid!=0 && arr[mid]!=arr[mid-1])&& (mid!=n-1 && arr[mid]!=arr[mid+1])){
                    return arr[mid];
                }
                if(mid%2==0 && arr[mid]!=arr[mid-1]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            return arr[mid];
        }
        public static void main(String[] args) {
            int[] arr= {9,8,7,6,5,4,3,2,1};
            int key = 1;
            System.out.println(getIndex(arr,key));
            int[] arr1 = {1,1,2,2,3,3,5};
            System.out.println(getUnique(arr1));
        }

}
