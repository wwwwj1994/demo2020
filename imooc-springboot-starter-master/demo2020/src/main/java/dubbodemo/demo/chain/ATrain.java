package dubbodemo.demo.chain;

/**
 * @author wj
 * @date 2020/9/11 - 0:06
 */
public class ATrain extends TrainChain{
    @Override
    public void doChain() {
        System.out.println("AAAAA");
        if (super.next != null) {
            super.next.doChain();
        }
    }
}
