package dubbodemo.demo.chain;

/**
 * @author wj
 * @date 2020/9/11 - 0:07
 */
public class Test {

    public static void main(String[] args) {
        TrainChain.Builder builder = new TrainChain.Builder();
        builder.addTrainChain(new ATrain())
                .addTrainChain(new BTrain());
        builder.build().doChain();
    }
}
