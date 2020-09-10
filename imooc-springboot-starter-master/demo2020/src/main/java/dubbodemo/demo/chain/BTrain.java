package dubbodemo.demo.chain;

/**
 * @author wj
 * @date 2020/9/11 - 0:07
 */
public class BTrain extends TrainChain {
    @Override
    public void doChain() {
        System.out.println("BBBBBB");
        if (super.next != null) {
            super.next.doChain();
        }
    }
}
