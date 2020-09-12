package dubbodemo.demo.iterator;

import dubbodemo.demo.composite.transparent.CourseComponet;

/**
 * @author wj
 * @date 2020/9/11 - 23:37
 */
public interface IcourseAggregate {

    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}
