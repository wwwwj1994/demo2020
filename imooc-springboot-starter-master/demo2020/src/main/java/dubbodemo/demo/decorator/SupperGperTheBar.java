package dubbodemo.demo.decorator;

/**
 * @author wj
 * @date 2020/9/7 - 22:14
 */
public class SupperGperTheBar extends GperDecorator {

    private static final Integer level = 2;

    private MyDecorator myDecorator;

    public SupperGperTheBar(MyDecorator myDecorator) {
        this.myDecorator = myDecorator;
    }


    @Override
    public String showMenu() {
        return this.myDecorator.showMenu() + "--作业--成长墙--商城";
    }

    public static Integer getLevel() {
        return level;
    }
}
