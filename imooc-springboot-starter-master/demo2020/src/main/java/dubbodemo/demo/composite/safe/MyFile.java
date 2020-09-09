package dubbodemo.demo.composite.safe;

/**
 * @author wj
 * @date 2020/9/8 - 22:26
 */
public class MyFile extends Direcotry{

    public MyFile(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
