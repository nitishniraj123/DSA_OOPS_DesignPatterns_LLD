package DSA.array;

public class Sort012 {

    public void sort012(int[] arr){
        int n=arr.length;
        int l=0,mid=0,h=n-1;
        while (mid<= h){
            switch (arr[mid]){
                case 0:
                    swap(arr,l++,mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,h--);
                    break;
            }
        }
    }
    public void swap(int[] arr,int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,2,2,1,0};
        Sort012 sort012 = new Sort012();
        sort012.sort012(arr);
        for(int i : arr)
            System.out.print(i+" ");
    }
}
