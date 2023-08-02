package cache;

import java.util.*;

public class LRUCacheByDequeAndHashSet {
    private void refer(Deque<Integer> dq, Set<Integer> set, int page, int mmSize) {
        if (set.contains(page)) {
            dq.remove(page);
            dq.addFirst(page);
        } else {
            if (dq.size() == mmSize) {
                int removeLeastRecentlyUsedPage = dq.pollLast();
                set.remove(removeLeastRecentlyUsedPage);
            }
            dq.addFirst(page);
            set.add(page);
        }
        System.out.println(dq);
    }

    public List<Integer> getRemainingPageInMainMemory(int[] pages, int mmSize) {
        Deque<Integer> dq = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int page : pages) {
            refer(dq, set, page, mmSize);
        }
        return new ArrayList<>(dq);
    }

    public static void main(String[] args) {
        int[] pages = {1, 2, 3, 4, 1, 2, 3, 5, 5, 6, 7, 8, 9};
        int mmSize = 4;
        LRUCacheByDequeAndHashSet lruCacheByDequeAndHashSet = new LRUCacheByDequeAndHashSet();
        System.out.println(lruCacheByDequeAndHashSet.getRemainingPageInMainMemory(pages, mmSize));
    }
}
