package dubbodemo.demo.bridge;

/**
 * @author wj
 * @date 2020/9/9 - 20:48
 */
public class EmailMessage implements Message{
    @Override
    public void send(String content, String user) {
        System.out.println("发送邮件消息：" + content + "给" + user);
    }
}
