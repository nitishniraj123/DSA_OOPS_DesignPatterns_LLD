package oops.ExcecuterService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableTask {
    public static void main(String[] args) {
        CallableTask callableTask = new CallableTask();
        try {
            callableTask.runCallableTask();
        }
        catch (Exception e){
            System.out.println(e.getCause());
        }
    }
    public void runCallableTask() throws ExecutionException, InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(1,4,1000,TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
        List<String> list = Arrays.asList("sachit", "manish", "nitish", "who am is", "not known", "!sonali","bxbnv","hfdhfsdhj","ghdfhjdfs");
        List<List<String>> sublist = new ArrayList<>();
        Future<List<String>> futureList = executorService.submit(new CallableImplementation(list));
        for (String hashCode : futureList.get()){
            System.out.println(hashCode);
        }
        executorService.shutdown();
    }

    private class CallableImplementation implements Callable<List<String>>{

        private List<String> list;

        public CallableImplementation(List<String> list) {
            this.list = list;
        }

        @Override
        public List<String> call() throws Exception {
            List<String> hashCodeOfNames = new ArrayList<>();
            System.out.println(Thread.currentThread().getId());
            for(String s : list){
                hashCodeOfNames.add(String.valueOf(s.hashCode()) + " "+s+" "+Thread.currentThread().getId());
            }
            return hashCodeOfNames;
        }
    }
}
