package dubbodemo.demo;

import lombok.SneakyThrows;

/**
 * @author wj
 * @date 2020/9/12 - 0:00
 */
public class MyTest implements Runnable {

    private int number;

    public MyTest(int number) {
        this.number = number;
    }

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(number);
        System.out.println(number);
    }

    public static void main(String[] args) {
        int[] arr = {15, 3, 56, 34, 26};
        for (int number : arr) {
            new Thread(new MyTest(number),number + "").start();
        }
    }
}
