package lang.thread;

/**
 * @author tangmaoheng
 * @createTime 2019年12月13日 14:59:00
 */
public class Counter {

    int count;

    public synchronized int getCount() {
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return count;
    }

    public synchronized void setCount(int count) {
        this.count = count;
        this.notifyAll();
    }
}
