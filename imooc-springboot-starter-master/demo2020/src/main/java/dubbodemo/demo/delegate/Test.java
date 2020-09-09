package dubbodemo.demo.delegate;

/**
 * @author wj
 * @date 2020/9/9 - 21:46
 */
public class Test {

    public static void main(String[] args) {
        Boos boos = new Boos();
        boos.task("java", new Leader());
        boos.task("php", new Leader());
        boos.task("js", new Leader());
    }
}
