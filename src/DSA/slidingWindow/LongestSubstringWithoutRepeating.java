package DSA.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public int getLongestSubstringSizeWithoutRepeating(String s){
        Map<Character,Integer> mp = new HashMap<>();
        int i=0,j=0,ans=0,latestRepeatedIndex=0;
        while (i<s.length()){
            if(mp.containsKey(s.charAt(i))){
                latestRepeatedIndex = Math.max(latestRepeatedIndex,mp.get(s.charAt(i))+1);
            }
            mp.put(s.charAt(i),i);
            ans = Math.max((i-latestRepeatedIndex+1),ans);
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abba";
        LongestSubstringWithoutRepeating longestSubstringWithoutRepeating = new LongestSubstringWithoutRepeating();
        System.out.println(longestSubstringWithoutRepeating.getLongestSubstringSizeWithoutRepeating(s));
    }
}
