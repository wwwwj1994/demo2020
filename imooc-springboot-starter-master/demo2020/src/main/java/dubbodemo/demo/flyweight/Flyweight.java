package dubbodemo.demo.flyweight;

/**
 * @author wj
 * @date 2020/9/8 - 20:27
 *
 * 享元模式（Flyweight Pattern） 又称为轻量级模式，是对象池的一种实现。类似于线程池，
 * 线程池可以避免不停的创建和销毁多个对象，消耗性能，提供了减少对象数量从而改善应用所需对象结构的方式
 *
 * 优点： 减少对象的创建，降低内存中对象数量，降低系统的内存，提高效率，减少内存之外的其他资源占用
 *
 * 缺点： 关注内，外部状态，关注线程安全问题，使系统、程序的逻辑复杂化
 */
public interface Flyweight {

    /**
     * 享元接口
     * @param species
     */
    void doFlyweight(String species);
}
