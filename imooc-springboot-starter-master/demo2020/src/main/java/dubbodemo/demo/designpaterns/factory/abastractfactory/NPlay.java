package dubbodemo.demo.designpaterns.factory.abastractfactory;

/**
 * @author wj
 * @date 2020/9/1 - 22:58
 */
public class NPlay implements Play{
    @Override
    public void playComputerGame() {
        System.out.println("玩国内游戏~~~");
    }
}
