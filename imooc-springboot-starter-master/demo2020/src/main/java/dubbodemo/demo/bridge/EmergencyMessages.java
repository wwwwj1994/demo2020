package dubbodemo.demo.bridge;

/**
 * @author wj
 * @date 2020/9/9 - 20:50
 */
public class EmergencyMessages extends AbstrantMessage{
    public EmergencyMessages(Message message) {
        super(message);
    }

    @Override
    public void send(String content, String user) {
        content = "【紧急】" + content;
        super.send(content, user);
    }
}
