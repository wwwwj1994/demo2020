package dubbodemo.demo.chain;

/**
 * 责任链模式（Chain of Responsibility Pattern） 是将链中每一个节点看作是一个对象，每个节点处理的请求均不同，且内部自动维护一个下一个节点对象。
 *         当一个请求从链式的首端发出时，会沿着链的路径一次传递给没一个节点对象，直至有对象处理这个请求位置。
 *
 * 属于行为型模式
 *
 * 责任链模式使用的场景：
 * 1、多个对象可以处理同一请求，但具体由那个对象处理则在运行时动态决定
 * 2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求
 * 3、可动态指定一组对象处理请求
 *
 * 优点：
 * 1、将请求与处理解耦
 * 2、请求处理者（节点对象）只需关注自己感兴趣的请求进行处理即可，对于不感兴趣的请求，直接转发个一下级对象
 * 3、具备链式传递处理请求功能，请求发送者无需知晓链路结构，只需等待请求处理结果
 * 4、链路结构灵活，可以通过改变链路结果动态地新增或删减责任
 * 5、易于扩展新的请求处理类（节点），符合开闭原则
 *
 * 缺点：
 * 1、责任链太长或者处理时间太长会影响整体性能
 * 2、如果节点对象存在循环引用时，会造成死循环，导致系统崩溃
 *
 * @author wj
 * @date 2020/9/10 - 23:59
 */
public abstract class TrainChain<T> {

    protected TrainChain next;


    public abstract void doChain();

    public static class Builder<T> {
        private TrainChain<T> head;

        private TrainChain<T> tail;

        public Builder<T> addTrainChain(TrainChain trainChain) {
            if (head == null) {
                this.head = this.tail = trainChain;
                return this;
            }
            this.tail.next = trainChain;
            this.tail = trainChain;
            return this;
        }

        public  TrainChain build() {
            return this.head;
        }
    }
}
