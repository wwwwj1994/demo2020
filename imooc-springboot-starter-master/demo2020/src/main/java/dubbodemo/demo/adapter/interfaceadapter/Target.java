package dubbodemo.demo.adapter.interfaceadapter;

/**
 * @author wj
 * @date 2020/9/9 - 0:09
 */
public interface Target {

    /**
     * 转换成5V电压
     * @return Integer
     */
    Integer conversion5();

    /**
     * 转换成10V电压
     * @return Integer
     */
    Integer conversion10();


    /**
     * 转换成110V电压
     * @return Integer
     */
    Integer conversion110();
}
