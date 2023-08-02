import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CustomStack {

    private static Stack<Integer> s ;
    static int minValue = Integer.MAX_VALUE;
    private static void push(int x){
        if(s.isEmpty()){
            minValue = x;
            s.push(x);
            return;
        }
        if(x>=minValue){
            s.push(x);
            return;
        }
        minValue = x;
        s.push(2*x - minValue);
    }

    private static void pop(){
        int temp = s.pop();
        if(temp<minValue){
            minValue = 2*minValue - temp;
        }
    }

    private static int findMin(){
            if(s.isEmpty()){
                return Integer.MIN_VALUE;
            }
            return minValue;
    }

    public static void main(String[] args) {
        s = new Stack<>();
        push(2);
        push(3);
        push(10);
        System.out.println(findMin());
        pop();
        pop();
        pop();
        System.out.println(findMin());
        push(10);
        push(-3);
        push(5);
        System.out.println(findMin());
    }
}
