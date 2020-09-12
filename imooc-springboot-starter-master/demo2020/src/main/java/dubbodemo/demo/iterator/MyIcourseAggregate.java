package dubbodemo.demo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @date 2020/9/11 - 23:41
 */
public class MyIcourseAggregate implements IcourseAggregate{

    private List<Course> list = new ArrayList<>();
    @Override
    public void add(Course course) {
        list.add(course);
    }

    @Override
    public void remove(Course course) {
        list.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new MyIterator<>(list);
    }
}
