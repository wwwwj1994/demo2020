package dubbodemo.demo.singleton.seriable;

import org.junit.Test;

import java.io.*;
import java.lang.invoke.SerializedLambda;

/**
 * @author wj
 * @date 2020/9/2 - 1:18
 */
public class SeriableTest {

    @Test
    public void test() {
        SeriableSingleton s = null;
        SeriableSingleton s1 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s = (SeriableSingleton) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s==s1);

    }
}
