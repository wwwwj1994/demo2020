package java1.prodconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wj
 * @date 2020/8/13 - 22:09
 */
public class ProdConsumerNewDemo {

    public static void main(String[] args) {
        MyFood myFood = new MyFood(new ArrayBlockingQueue(10));

        new Thread(() -> {
            myFood.prodAddQueue();
        },"AAA").start();

        new Thread(() -> {
            myFood.consumerQueue();
        },"AAA").start();

//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        myFood.setFlag();
    }
}

class MyFood {

    private volatile Boolean FLAG = true;

    private AtomicInteger number = new AtomicInteger();

    private BlockingQueue<String> blockingQueue = null;

    public MyFood(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void prodAddQueue() {

        String data = null;
        boolean booleanFlag;
        while (FLAG) {
            System.out.println(number.get() == 5);
            if (number.get() == 5) {
                FLAG = false;
            }
            try {
                data = number.incrementAndGet() + "";
                booleanFlag = blockingQueue.offer(data, 2, TimeUnit.SECONDS);
                if (booleanFlag) {
                    System.out.println("生产者生产了number");
                } else {
                    System.out.println("生产者生产失败了number");
                }
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consumerQueue() {
        String data = null;
        while (FLAG) {
            try {
                data = blockingQueue.poll(2, TimeUnit.SECONDS);
                if (data == null || data.equalsIgnoreCase("")) {
                    System.out.println("2秒钟出问题了");
//                    FLAG = false;
                    return;
                }
                System.out.println("消费成功" + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag() {
        this.FLAG = false;
    }
}
