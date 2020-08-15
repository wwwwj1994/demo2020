package java1.prodconsumer;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wj
 * @date 2020/8/13 - 21:50
 */
public class ProdConsumerDemo {
    public static void main(String[] args) {
        ShareDate shareDate = new ShareDate();
        new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                shareDate.prodNumber();
            }
        },"AAA").start();

        new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                shareDate.consumerNumber();
            }
        },"BBB").start();
    }

}

class ShareDate {
    private int number = 0;

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void prodNumber() {
        lock.lock();
        try {
            while (number != 0){
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            number++;
            System.out.printf("生产一个number");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void consumerNumber() {
        lock.lock();
        try {
            while (number == 0){
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            number--;
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者消费一个");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

