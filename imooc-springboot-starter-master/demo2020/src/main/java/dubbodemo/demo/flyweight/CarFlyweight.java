package dubbodemo.demo.flyweight;

/**
 * @author wj
 * @date 2020/9/8 - 20:28
 */
public class CarFlyweight implements Flyweight{

    private String from;
    private String to;
    private String species;

    public CarFlyweight(String from, String to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public void doFlyweight(String species) {
        System.out.println(from  + "-->" + to + "种类" + species);
    }
}
