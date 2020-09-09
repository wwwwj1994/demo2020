package dubbodemo.demo.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wj
 * @date 2020/9/8 - 20:32
 */
public class CarFlyweightFactory {

    private static Map<String,CarFlyweight> map = new HashMap<String, CarFlyweight>();

    public static CarFlyweight getInstance (String from, String to) {
        String key = from + "-->" + to;
        if (map.get(key) != null) {
            return map.get(key);
        }
        CarFlyweight carFlyweight = new CarFlyweight(from, to);
        map.put(key, carFlyweight);
        return carFlyweight;
    }
}
