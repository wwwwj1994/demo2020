package dubbodemo.demo.iterator;

/**
 * @author wj
 * @date 2020/9/11 - 23:43
 */
public class Test {

    public static void main(String[] args) {
        Course JAVA = new Course("JAVA");
        Course PHP = new Course("PHP");
        Course c = new Course("C");
        Course cadd = new Course("C++");

        MyIcourseAggregate arr = new MyIcourseAggregate();

        arr.add(JAVA);
        arr.add(PHP);
        arr.add(c);
        arr.add(cadd);

        Iterator<Course> iterator = arr.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
