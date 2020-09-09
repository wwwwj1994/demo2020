package dubbodemo.demo.adapter.objectadapter;

/**
 * @author wj
 * @date 2020/9/9 - 0:07
 */
public class Adaptee {

    private Integer value = 220;

    public Integer conversion220() {
        System.out.println("这是中国默认电压");
        return this.value;
    }
}
