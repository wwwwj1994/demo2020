package dubbodemo.demo.adapter.interfaceadapter;



/**
 * @author wj
 * @date 2020/9/9 - 0:11
 * 属于接口适配器，通过接口定义多个适配方法，可以是的公共方法聚合一起，方便管理
 */
public class MyAdapter implements Target {

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

    @Override
    public Integer conversion10() {
        return null;
    }

    @Override
    public Integer conversion110() {
        return null;
    }
}
