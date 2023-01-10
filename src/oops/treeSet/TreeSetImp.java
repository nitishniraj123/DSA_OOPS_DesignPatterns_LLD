package oops.treeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetImp {
    static class Pair{
        int first;
        int second;

        public void setFirst(int first) {
            this.first = first;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    public static void main(String[] args) {
        TreeSet<Pair> treeSet = new TreeSet<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.first!=o2.first)
                    return o1.first - o2.first;
                else
                    return  o1.second - o2.second;
            }
        });
        treeSet.add(new Pair(1,2));
        treeSet.add(new Pair(1,3));
        treeSet.add(new Pair(0,3));
        Pair p1= treeSet.floor(new Pair(2,2));
        System.out.println(treeSet);
       //System.out.println(p1.first+" "+p1.second);
//        for(Pair p : treeSet){
//            System.out.println(p.first +" "+p.second);
//        }
    }
}
