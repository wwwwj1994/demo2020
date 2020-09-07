package dubbodemo.demo.prototype.adeepclone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author wj
 * @date 2020/9/6 - 21:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeepClone implements Serializable {

    private String name;

    private Integer age;

    private List<String> list;

    public static void main(String[] args) {
        DeepClone deepClone = new DeepClone("wj",26, Arrays.asList("1","2","3"));
        System.out.println(deepClone);

        try {
            FileOutputStream fos = new FileOutputStream("wj.clone");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(deepClone);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("wj.clone");
            ObjectInputStream ois = new ObjectInputStream(fis);
            DeepClone deepClone1 = (DeepClone)ois.readObject();
            ois.close();
            System.out.println(deepClone1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("wj.clone");
            ObjectInputStream ois = new ObjectInputStream(fis);
            DeepClone deepClone2 = (DeepClone)ois.readObject();
            System.out.println(deepClone2);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
