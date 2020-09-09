package dubbodemo.demo.composite.transparent;

/**
 * @author wj
 * @date 2020/9/8 - 21:46
 *
 *
 */
public class Course extends CourseComponet{

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponet courseComponet) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponet courseComponet) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this.name + "--->" + this.price);
    }
}
