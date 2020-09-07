package dubbodemo.demo.decorator;

/**
 * @author wj
 * @date 2020/9/7 - 22:03
 */
public class NormGperTheBar extends GperDecorator{

    private static final Integer level = 1;

    private MyDecorator myDecorator;

    public NormGperTheBar(MyDecorator myDecorator) {
        this.myDecorator = myDecorator;
    }

    @Override
    public String showMenu() {
        return this.myDecorator.showMenu() + "--作业--成长墙";
    }

    public static Integer getLevel() {
        return level;
    }
}
