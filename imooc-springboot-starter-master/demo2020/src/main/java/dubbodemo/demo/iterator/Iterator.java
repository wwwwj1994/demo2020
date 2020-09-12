package dubbodemo.demo.iterator;

/**
 * @author wj
 * @date 2020/9/11 - 23:30
 *
 * 迭代器模式： （Iterator Pattern） 又称为游标模式（Cursor Pattern） 它提供一种顺序访问集合、容器对象的方法，而又无需暴露集合内部表示
 *
 * 本质：抽离集合对象迭代行为到迭代器中，提供一致访问接口
 *
 * 属于行为型模式
 *
 * 优点：
 * 1、多态迭代：为不同的聚合结构提供一致的遍历接口，即一个迭代接口可以访问不同的聚集对象
 * 2、简化集合对象接口；迭代器模式将集合对象本身应该提供的元素迭代接口抽取到了迭代器中。使集合对象无需关心具体迭代行为
 * 3、元素迭代功能多样化：每个集合对象都可以提供一个或多个不同迭代器，使得同种元素聚合结构可以有不同的迭代行为
 * 4、解耦迭代与集合：迭代器模式封装了具体的迭代算法，迭代算法的变化，不会影响集合对象的架构
 *
 * 缺点：
 * 1、对于比较简单的遍历（像数组或者有序列表），使用迭代器方式遍历较为繁琐
 *
 */
public interface Iterator<E> {

    /**
     * 获取集合的下个元素
     * @return Element
     */
    E next();


    /**
     * 判断是否含有下一个元素
     * @return boolean
     */
    boolean hasNext();

}