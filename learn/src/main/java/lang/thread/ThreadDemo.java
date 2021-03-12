package lang.thread;

/**
 * @author tangmaoheng
 * @createTime 2019年12月17日 09:18:00
 */
public class ThreadDemo {

    public void demo(){
        Thread thread1= new Thread(() -> System.out.println("A"));

        Thread thread2=new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        });

        Thread thread3=new Thread(() -> {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("C");
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
