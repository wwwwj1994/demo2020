package dubbodemo.demo.composite.safe;

import dubbodemo.demo.composite.transparent.CourseComponet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @date 2020/9/8 - 22:26
 */
public class Folder extends Direcotry {

    private Integer level;

    private List<Direcotry> dirs;

    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
        dirs = new ArrayList<Direcotry>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Direcotry dir : dirs) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < this.level; j++) {
                    if (j == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            dir.show();
        }
    }

    public boolean add(Direcotry dir) {
        return this.dirs.add(dir);
    }

    public Direcotry get(Integer index) {
        return this.dirs.get(index);
    }

    public boolean remove(Direcotry dir) {
        return this.dirs.remove(dir);
    }
}
