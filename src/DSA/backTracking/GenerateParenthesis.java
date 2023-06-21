package DSA.backTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    List<String> ans;
    private void generateParenthesisUtils(int o,int c,int n,String parenthesis){
        if(o>n || c>n){
            return;
        }
        if(c>o){
            return;
        }
        if(c == n){
            ans.add(parenthesis);
        }
        generateParenthesisUtils(o+1,c,n,parenthesis+"(");
        generateParenthesisUtils(o,c+1,n,parenthesis+")");
    }
    public List<String> generateParenthesis(int n){
         ans= new ArrayList<>();
         int o=0,c=0;
         String parenthesis ="";
         generateParenthesisUtils(o,c,n,parenthesis);
         return ans;
    }

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        int n = 3;
        System.out.println(generateParenthesis.generateParenthesis(4));
    }
}
