package dubbodemo.demo.facede;

/**
 * @author wj
 * @date 2020/9/7 - 20:56
 */
public class FaceService {

    /**
     *  有点：
     *  1、简化了调用过程，无需深入了解子系统，以防给子系统带来风险
     *  2、减少客户端的依赖，解耦
     *  3、更好的划分访问层次，提高安全性
     *  4、遵循迪米特法则，最少知道原则
     *
     *  缺点：
     *  1、当增加子系统和扩展子系统行为时，可能容易带来未知风险
     *  2、不符合开闭原则
     *  3、某些情况下可能违背单一职责原则
     *
     *  属于静态代理的一种
     * */

    private AService a = new AService();

    private BService b = new BService();

    public void test () {
        a.doA();
        b.doB();
    }
}
