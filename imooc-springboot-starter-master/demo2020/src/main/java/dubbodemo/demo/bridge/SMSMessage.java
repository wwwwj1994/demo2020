package dubbodemo.demo.bridge;

/**
 * @author wj
 * @date 2020/9/9 - 20:47
 */
public class SMSMessage implements Message{
    @Override
    public void send(String content, String user) {
        System.out.println("发送短信消息：" + content + "给" + user);
    }
}
