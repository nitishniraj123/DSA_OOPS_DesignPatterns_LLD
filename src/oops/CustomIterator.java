package oops;

import java.util.*;
import java.util.function.Consumer;

class CustomIteratorUtil<T> implements Iterable<T> {

    private T[] arrayList;
    private int Size;

    public CustomIteratorUtil(T[] arr) {
        this.arrayList = arr;
        this.Size = arr.length;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < Size && arrayList[currentIndex] != null;
            }

            @Override
            public T next() {
                return arrayList[currentIndex++];
            }
        };
        return it;
    }
}

public class CustomIterator {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        CustomIteratorUtil<Integer> customIteratorUtil = new CustomIteratorUtil<>(arr);
        Iterator<Integer> itr = customIteratorUtil.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}


