package dubbodemo.demo.designpaterns.factory.abastractfactory;

/**
 * @author wj
 * @date 2020/9/1 - 23:05
 */
public class Test {

    @org.junit.Test
    public void test() {
        AbastractFactory factory = new NAbastractFactory();
        factory.buyMusic().openMusic();
        factory.buyPlay().playComputerGame();
    }
}
