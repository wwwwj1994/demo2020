package dubbodemo.demo.adapter.classadapter;

/**
 * @author wj
 * @date 2020/9/9 - 0:11
 * 属于类适配器，通过继承
 */
public class MyAdapter extends Adaptee implements Target {


    @Override
    public Integer conversion5() {
        Integer integer = this.conversion220();
        integer = integer /44;
        return integer;
    }
}
