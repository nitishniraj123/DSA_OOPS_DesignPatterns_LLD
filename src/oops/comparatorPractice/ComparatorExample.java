package oops.comparatorPractice;

import java.util.*;

public class ComparatorExample {

    static class MyPair{
        String first;
        int second;

        public MyPair(String first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "MyPair{" +
                    "first='" + first + '\'' +
                    ", second=" + second +
                    '}';
        }
    }

    private static class ComparingCriteria implements Comparator<MyPair>{

        @Override
        public int compare(MyPair o1, MyPair o2) {
            if(o1.first.equals(o2.first)){
                return o1.second - o2.second;
            }
            return o1.first.compareTo(o2.first);
        }
    }
    private static void arraySortUsingComparator(){
        MyPair[] arr1 = new MyPair[4];
        arr1[0]=new MyPair("nitish",3);
        arr1[1]=new MyPair("nitish",2);
        arr1[2]=new MyPair("niraj",4);
        arr1[3]=new MyPair("nisha",2);
        Arrays.sort(arr1,new Comparator<MyPair>(){
            @Override
            public int compare(MyPair o1, MyPair o2) {
                if(o1.first.equals(o2.first)){
                    return o1.second - o2.second;
                }
                return o1.first.compareTo(o2.first);
            }
        });

        MyPair[] arr2 = new MyPair[4];
        arr2[0]=new MyPair("nitish",3);
        arr2[1]=new MyPair("nitish",2);
        arr2[2]=new MyPair("niraj",4);
        arr2[3]=new MyPair("nisha",2);
        Arrays.sort(arr2,(o1, o2) -> {
            if(o1.first.equals(o2.first)){
                return o1.second - o2.second;
            }
            return o1.first.compareTo(o2.first);
        });

        MyPair[] arr3 = new MyPair[4];
        arr3[0]=new MyPair("nitish",3);
        arr3[1]=new MyPair("nitish",2);
        arr3[2]=new MyPair("niraj",4);
        arr3[3]=new MyPair("nisha",2);
        Arrays.sort(arr3,new ComparingCriteria());
        System.out.println("arr1 is "+ Arrays.toString(arr1));
        System.out.println("arr2 is "+ Arrays.toString(arr2));
        System.out.println("arr3 is "+Arrays.toString(arr3));
    }

    private static void listSortUsingComparator(){
        List<MyPair> l1 = new ArrayList<>();
        l1.add(new MyPair("nitish",3));
        l1.add(new MyPair("nitish",2));
        l1.add(new MyPair("niraj",4));
        l1.add(new MyPair("nisha",2));
        Collections.sort(l1, new Comparator<MyPair>() {
            @Override
            public int compare(MyPair o1, MyPair o2) {
                if(o1.first.equals(o2.first)){
                    return o1.second - o2.second;
                }
                return o1.first.compareTo(o2.first);
            }
        });

        List<MyPair> l2 = new ArrayList<>();
        l2.add(new MyPair("nitish",3));
        l2.add(new MyPair("nitish",2));
        l2.add(new MyPair("niraj",4));
        l2.add(new MyPair("nisha",2));
        Collections.sort(l2,(o1, o2) -> {
            if(o1.first.equals(o2.first)){
                return o1.second - o2.second;
            }
            return o1.first.compareTo(o2.first);
        });

        List<MyPair> l3 = new ArrayList<>();
        l3.add(new MyPair("nitish",3));
        l3.add(new MyPair("nitish",2));
        l3.add(new MyPair("niraj",4));
        l3.add(new MyPair("nisha",2));
        Collections.sort(l3,new ComparingCriteria());
        System.out.println("list1 is "+ l1);
        System.out.println("list2 is "+ l2);
        System.out.println("list3 is "+l3);

    }
    private static void minMaxHeapUsingComparator(){
        PriorityQueue<MyPair> pq = new PriorityQueue<>(new Comparator<MyPair>() {
            @Override
            public int compare(MyPair o1, MyPair o2) {
                if(o1.first.equals(o2.first)){
                    return o1.second - o2.second;
                }
                return o1.first.compareTo(o2.first);
            }
        });

        pq.add(new MyPair("nitish",3));
        pq.add(new MyPair("nitish",2));
        pq.add(new MyPair("niraj",4));
        pq.add(new MyPair("nisha",2));

        PriorityQueue<MyPair> pq1 = new PriorityQueue<>(new ComparingCriteria());
        pq1.add(new MyPair("nitish",3));
        pq1.add(new MyPair("nitish",2));
        pq1.add(new MyPair("niraj",4));
        pq1.add(new MyPair("nisha",2));
        System.out.println("pq is " +pq);
        System.out.println("pq1 is "+pq1);
    }

    public static void main(String[] args) {
        minMaxHeapUsingComparator();
        arraySortUsingComparator();
    }
}
