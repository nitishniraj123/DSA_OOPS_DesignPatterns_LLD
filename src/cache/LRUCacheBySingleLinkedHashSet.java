package cache;

import java.util.*;

public class LRUCacheBySingleLinkedHashSet {

    private void refer(Set<Integer> pagesSet, int pageNo, int mmSize) {
        if (pagesSet.contains(pageNo)) {
            pagesSet.remove(pageNo);//remove for update
        } else {
            if (pagesSet.size() == mmSize) {//overflow
                int leastRecentlyUsedPage = pagesSet.iterator().next();
                Map<Integer,Integer> mp = new HashMap<>();
                pagesSet.remove(leastRecentlyUsedPage);
            }
        }
        pagesSet.add(pageNo);//update/create
        System.out.println(pagesSet);
    }

    Set<Integer> getRemainingPageInMainMemory(int[] pages, int mmSize) {
        Set<Integer> pagesSet = Collections.synchronizedSet(new LinkedHashSet<>(mmSize));
        for (int page : pages) {
            refer(pagesSet, page, mmSize);
        }
        return pagesSet;
    }

    public static void main(String[] args) {
        LRUCacheBySingleLinkedHashSet lruCacheBySingleLinkedHashSet = new LRUCacheBySingleLinkedHashSet();
        int[] pages = {1, 2, 3, 4, 1, 2, 3, 5, 5, 6, 7, 8, 9};
        int mmSize = 4;
        System.out.println(lruCacheBySingleLinkedHashSet.getRemainingPageInMainMemory(pages, mmSize));
    }
}
