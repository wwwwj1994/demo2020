package dubbodemo.demo.designpaterns.factory.abastractfactory;

/**
 * @author wj
 * @date 2020/9/1 - 22:59
 */
public class YPlay implements Play{
    @Override
    public void playComputerGame() {
        System.out.println("玩国外游戏");
    }
}
