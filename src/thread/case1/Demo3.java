package thread.case1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Mycallable mc = new Mycallable();

        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);
        t1.start();

        System.out.println(ft.get());
    }
}
