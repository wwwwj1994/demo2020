package dubbodemo.demo.bridge;

/**
 * @author wj
 * @date 2020/9/9 - 20:46
 *
 * 桥接模式（Bridge Pattern） 也称为桥梁模式、接口模式或柄体模式，是将抽象部分与它的具体实现部分分离，使他们都可以独立地变化
 * （不用继承模式）
 * 通过组合的方式建立两个类之间的联系，而不是继承
 *
 * 属于结构模式
 *
 * 优点：
 * 1、分离抽象部分及其具体实现部分
 * 2、提高了系统的扩展性
 * 3、符合开闭原则
 * 4、符合合成复用原则
 *
 * 缺点：
 * 1、增加了系统的理解和设计难度
 * 2、需要正确的识别系统中两个独立变化的维度
 */
public interface Message {

    /**
     * 发送消息
     * @param content
     * @param user
     */
    void send (String content, String user);
}
