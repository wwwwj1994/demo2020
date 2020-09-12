package dubbodemo.demo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @date 2020/9/12 - 23:33
 */
public class MyController {

    private List<IAction> list = new ArrayList<>();

    public void addAction(IAction action) {
        list.add(action);
    }

    public void execute(IAction iAction) {
        iAction.execute();
    }

    public void executes() {
        for (IAction action : list) {
            action.execute();
        }
    }
}
