package dubbodemo.demo.proxy.staticproxy;

import dubbodemo.demo.proxy.staticproxy.IPerson;

/**
 * @author wj
 * @date 2020/9/6 - 23:24
 */
public class ZhangSan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("女的");
    }
}
