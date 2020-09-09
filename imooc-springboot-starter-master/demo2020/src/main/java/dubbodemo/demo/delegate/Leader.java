package dubbodemo.demo.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wj
 * @date 2020/9/9 - 21:40
 */
public class Leader implements TheProgrammer{

    private Map<String, TheProgrammer> map = new HashMap<>();

    public Leader() {
        map.put("java", new TheProgrammerA());
        map.put("php", new TheProgrammerB());
    }

    @Override
    public void task(String content) {
        if (map.get(content) == null) {
            System.out.println("无法完成任务：" + content);
            return;
        }
        map.get(content).task(content);
    }
}
