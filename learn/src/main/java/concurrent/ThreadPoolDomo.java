package concurrent;

import lang.thread.Counter;

import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author tangmaoheng
 * @createTime 2019年12月17日 09:19:00
 */
public class ThreadPoolDomo {


    public static void newFixed(){


        ExecutorService pool = Executors.newFixedThreadPool(3);
        Counter counter = new Counter();
        for (int i = 0; i <9 ; i++) {
            final int num=i;
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    counter.setCount(num);
                    System.out.println(Thread.currentThread().getName()+ "正在执行。。。"+counter.getCount());
                }
            });
        }
        pool.shutdown();
    }


    public static void demo(){

        ExecutorService pool = Executors.newFixedThreadPool(4);


        Future<String> submit = pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "ok";
            }
        });
        try {
            System.out.println(submit.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    public static void one(){
        //默认大小，动态增加线程数
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //单个线程（保证顺序执行）
        ExecutorService pool2 = Executors.newSingleThreadExecutor();
        //无限大小用来做定时任务
        ScheduledExecutorService pool3 = Executors.newScheduledThreadPool(3);
    }

    //异步执行
    public static void demo2(){

        ExecutorService pool = Executors.newFixedThreadPool(4);

        CompletableFuture<String> async = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "demo2";
            }
        }, pool);

        async.thenAccept(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Callback success:"+s);
            }
        });
        pool.shutdown();
    }

}
