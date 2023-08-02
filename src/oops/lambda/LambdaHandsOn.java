package oops.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.OptionalLong;

public class LambdaHandsOn {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        long evenCount = integerList.stream().filter(e->e%2==0).count();
        System.out.println(evenCount);
        LongSummaryStatistics summaryStatistics = integerList.stream().filter(e->e%2==0).mapToLong(Integer::longValue).summaryStatistics();
        System.out.println(summaryStatistics);
        long sum = integerList.stream().filter(e->e%2==0).mapToLong(Integer::longValue).sum();
        System.out.println(sum);
        OptionalLong max = integerList.stream().filter(e->e%2==0).mapToLong(Integer::longValue).max();
        System.out.println(max);
    }
}
