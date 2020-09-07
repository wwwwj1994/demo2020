package dubbodemo.demo.proxy.staticproxy;

/**
 * @author wj
 * @date 2020/9/6 - 23:25
 */
public class ZhangLaoSan implements IPerson{

    private ZhangSan zs;

    public ZhangLaoSan(ZhangSan zs) {
        this.zs = zs;
    }

    @Override
    public void findLove() {
        System.out.println("前置");
        zs.findLove();
        System.out.println("后置");
    }
}
