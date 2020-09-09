package dubbodemo.demo.bridge;

/**
 * @author wj
 * @date 2020/9/9 - 20:55
 */
public class Test {

    public static void main(String[] args) {
        AbstrantMessage abstrantMessage = new EmergencyMessages(new EmailMessage());

        abstrantMessage.send("请假单","wj");

    }
}
