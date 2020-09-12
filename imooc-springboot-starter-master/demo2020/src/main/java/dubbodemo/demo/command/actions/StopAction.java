package dubbodemo.demo.command.actions;

import dubbodemo.demo.command.GPlayer;
import dubbodemo.demo.command.IAction;

/**
 * @author wj
 * @date 2020/9/12 - 23:30
 */
public class StopAction implements IAction {

    private GPlayer gPlayer;

    public StopAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.stop();
    }
}
