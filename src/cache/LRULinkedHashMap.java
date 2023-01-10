package cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMap extends LinkedHashMap<Integer, Integer> {

    private Integer capacity;

    public LRULinkedHashMap(int initialCapacity) {
        super(initialCapacity);
        this.capacity = initialCapacity;
    }

    @Override
    public synchronized boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return this.capacity < size();//eviction
    }

    public synchronized Integer get(Integer key) {
        return super.getOrDefault(key, -1);
    }

    public synchronized Integer put(Integer key, Integer value) {
        return super.putIfAbsent(key, value);
    }

    @Override
    public String toString() {
        return "LRULinkedHashMap{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        LRULinkedHashMap lruLinkedHashMap = new LRULinkedHashMap(4);
        int[] pages = {1, 2, 3, 4, 1, 2, 3, 5, 5, 6, 7, 8, 9};
        for (int i : pages) {
            lruLinkedHashMap.put(i, i);
        }
        System.out.println(lruLinkedHashMap);
    }
}
