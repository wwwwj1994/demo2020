package dubbodemo.demo.adapter.objectadapter;

/**
 * @author wj
 * @date 2020/9/9 - 0:11
 * 属于对象适配器，通过组合模式
 */
public class MyAdapter implements Target{

    private Adaptee adaptee;

    public MyAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public Integer conversion5() {
        Integer integer = this.adaptee.conversion220();
        integer = integer /44;
        return integer;
    }
}
