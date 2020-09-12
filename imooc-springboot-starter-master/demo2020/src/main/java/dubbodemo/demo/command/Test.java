package dubbodemo.demo.command;

import com.sun.org.apache.bcel.internal.generic.NEW;
import dubbodemo.demo.command.actions.PauseAction;
import dubbodemo.demo.command.actions.PlayAction;
import dubbodemo.demo.command.actions.SpeedAction;
import dubbodemo.demo.command.actions.StopAction;

/**
 * @author wj
 * @date 2020/9/12 - 23:35
 */
public class Test {

    public static void main(String[] args) {
        GPlayer gPlayer = new GPlayer();
        MyController myController = new MyController();
        myController.addAction(new PlayAction(gPlayer));
        myController.addAction(new SpeedAction(gPlayer));
        myController.addAction(new PauseAction(gPlayer));
        myController.addAction(new StopAction(gPlayer));
        myController.executes();
    }
}
