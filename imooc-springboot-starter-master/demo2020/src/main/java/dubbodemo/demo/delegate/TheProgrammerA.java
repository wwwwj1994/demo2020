package dubbodemo.demo.delegate;

/**
 * @author wj
 * @date 2020/9/9 - 21:40
 */
public class TheProgrammerA implements TheProgrammer{
    @Override
    public void task(String content) {
        System.out.println("程序员A开始工作：" + content);
    }
}
