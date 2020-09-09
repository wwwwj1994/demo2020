package dubbodemo.demo.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wj
 * @date 2020/9/9 - 23:58
 */
public class EatFactory {

    public static String EAT_FRUIT = "EATFRUIT";

    public static String EAT_RICE = "EATRICE";

    public static String EAT_THE_BREAD = "EATTHEBREAD";

    public static String NO_EAT = "NOEAT";

    private static Map<String, Eat> map = new HashMap<>();

    static {
        map.put("EATFRUIT", new EatFruit());
        map.put("EATRICE", new EatRice());
        map.put("EATTHEBREAD", new EatTheBread());
        map.put("NO_EAT", new NoEat());
    }


    public static Set<String> getKeys() {
        return map.keySet();
    }

    public static Eat getEatInstance(String key) {
        if (map.get(key) != null) {
            return map.get(key);
        }
        return map.get(NO_EAT);
    }
}
