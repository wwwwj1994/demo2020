package dubbodemo.demo.bridge;

/**
 * @author wj
 * @date 2020/9/9 - 20:51
 */
public abstract class AbstrantMessage{

    private Message message;

    public AbstrantMessage(Message message) {
        this.message = message;
    }

    public void send(String content, String user) {
        message.send(content, user);
    }
}
