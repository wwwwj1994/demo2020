package dubbodemo.demo.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @date 2020/9/8 - 21:46
 */
public class CoursePackage extends CourseComponet {

    private List<CourseComponet> list = new ArrayList<CourseComponet>();

    private String name;

    public List<CourseComponet> getList() {
        return list;
    }

    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponet courseComponet) {
        this.list.add(courseComponet);
    }

    @Override
    public void removeChild(CourseComponet courseComponet) {
        this.list.remove(courseComponet);
    }

    @Override
    public String getName(CourseComponet courseComponet) {
        return this.name;
    }

    /**
     *
     * 根据list中的CourseComponet的不同子类调用不同的print方法
     *
     * */
    @Override
    public void print() {
        System.out.println(this.name);

        for (CourseComponet c : list) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("       ");
                }
                for (int j = 0; j < this.level; j++) {
                    if (j == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            c.print();
        }
    }

}
