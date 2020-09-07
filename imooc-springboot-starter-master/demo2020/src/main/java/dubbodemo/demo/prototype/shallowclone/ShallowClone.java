package dubbodemo.demo.prototype.shallowclone;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wj
 * @date 2020/9/6 - 21:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShallowClone implements Cloneable{

    private String name;

    private Integer age;

    private List<String> list;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @SneakyThrows
    public static void main(String[] args) {
        ShallowClone shallowClone = new ShallowClone();
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        shallowClone.setList(list);
        shallowClone.setName("wj");
        shallowClone.setAge(26);
        ShallowClone clone1 = (ShallowClone)shallowClone.clone();
        System.out.println(clone1.getList());
        shallowClone.getList().add("4");
        shallowClone.setName("wwwwwwwj");
        ShallowClone clone2 = (ShallowClone)shallowClone.clone();
        System.out.println(clone2 == clone1);
        // 当克隆对象改变时，其内容克隆之后的内容也跟着改变,基本类型或者String会不变，引用类型会克隆前后跟着变化
        System.out.println(clone2.getList() == clone1.getList());
        System.out.println(clone2.getList());
        System.out.println(clone1.getName());
    }
}
