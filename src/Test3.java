public class Test3 {
    private static void solve(int[] a1,int[] a2){
        int i,j,temp,c,n=a1.length,k;
        i=n-1;
        j=n-1;
        k=(2*n-1);
        while(i>=0 && j>=0){
            if(a1[i]>=a2[j]){
                a2[k--]=a1[i];
                i--;
            }
            else{
                a2[k--]=a2[j];
                j--;
            }
        }
        while(i>=0){
            a2[k--]=a1[i];
            i--;
        }

        while(j>=0){
            a2[k--]=a2[j];
            j--;
        }
    }

    public static void main(String[] args) {
//        int[] a1 = { 6, 3, 5, 7, 9};
//        int[] a2 = {2, 4, 6, 8, 10,-1,-1,-1,-1,-1};
//        int[] a1 = { 6, 7, 8, 9, 10};
//        int[] a2 = {1, 2, 3, 4, 5,-1,-1,-1,-1,-1};

        int[] a1 = { 1, 2, 3, 4, 5};
        int[] a2 = {3, 4, 8, 9, 11,-1,-1,-1,-1,-1};



        solve(a1,a2);

        for(int a : a1){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a : a2){
            System.out.print(a+" ");
        }
    }
}