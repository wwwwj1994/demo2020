package dubbodemo.demo.composite.safe;

/**
 * @author wj
 * @date 2020/9/8 - 22:25
 * 文件夹
 * **************安全模式
 *
 * 组合模式：（Composite Pattern） 也称为整体-部分模式（Part-Whole）它的宗旨是通过将单个对象（叶子节点）和组合对象（树枝节点）用相同的接口进行表示
 * 作用：是客户端对单个对象和组合对象保持一致的方式处理
 * 属于结构型模式
 *
 * 应用场景：
 * 1、希望客户端可以忽略组合对象与单个对象的差异时
 * 2、对象层次具备整体和部分，呈树形结构（如树形菜单，操作系统目录结构，公司组织架构等）
 *
 * 透明模式和安全模式：区别就是抽象类是否提供所有的方法，如果只提供公共方法那么就是安全的
 *
 * 优点：
 * 1、清除底定义层次的复杂对象，表示对象的全部或者部分层次
 * 2、让客户端忽略了层次的差异，方便对整个层次结构进行控制
 * 3、简化客户端代码
 * 4、符合开闭原则
 * 缺点：
 * 1、限制类型时会较为复杂
 * 2、使设计变得更加抽象
 */
public abstract class Direcotry {

    protected String name;

    public Direcotry(String name) {
        this.name = name;
    }

    public abstract void show();
}
