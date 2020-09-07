package dubbodemo.demo.decorator;

/**
 * @author wj
 * @date 2020/9/7 - 22:18
 */
public class SumGperTheBar extends GperDecorator{

    @Override
    public String showMenu() {
        return "问答-文章-精品课-冒泡-商城";
    }
}
