package DSA;

import java.util.*;

public class GFG {

    private static int minStepsUtil (String str , char x){
        int ans = 0,f=0;
        if(str.charAt(0)!=x){
            f=1;
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=x){
                f=1;
            }
            if(str.charAt(i)!=str.charAt(i-1)){
                if(str.charAt(i-1)==x){
                    ans++;
                }
            }
        }
        if(f==1)
            ans++;
        if(str.charAt(str.length()-1)==x)
            ans++;
        return ans;
    }
    static int minSteps(String str){
        //case 1 : start removing 0 then 1
        //case 2 : start removing 1 then 0
        //return minimum of both the case
        return Math.min(minStepsUtil(str,'0'),minStepsUtil(str,'1'));
    }

    public static void main(String[] args) {
        String str = "0010100";
        System.out.println(minSteps(str));

        List<String>  l = new ArrayList<>();
        l.add("nitish");
        l.add("nitish");
        l.add("niraj");
        Set<String> s = new HashSet<>();
        s.addAll(l);
        System.out.println(s);
        System.out.println(l);
    }
}
