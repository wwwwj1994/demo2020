package dubbodemo.demo.decorator;

/**
 * @author wj
 * @date 2020/9/7 - 22:45
 */
public class Test {

    public static void main(String[] args) {
        MyDecorator myDecorator = new SumGperTheBar();
        System.out.println(myDecorator.showMenu());

        myDecorator = new NormGperTheBar(myDecorator);

        System.out.println(myDecorator.showMenu());

        myDecorator = new SupperGperTheBar(myDecorator);

        System.out.println(myDecorator.showMenu());
    }
}
