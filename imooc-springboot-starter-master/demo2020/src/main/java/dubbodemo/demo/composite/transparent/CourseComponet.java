package dubbodemo.demo.composite.transparent;

/**
 * @author wj
 * @date 2020/9/8 - 21:42
 * 透明模式
 */
public abstract class CourseComponet {

    public void addChild(CourseComponet courseComponet) {
        throw  new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponet courseComponet) {
        throw  new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CourseComponet courseComponet) {
        throw  new UnsupportedOperationException("不支持获取名字操作");
    }

    public double getPrice(CourseComponet courseComponet) {
        throw  new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw  new UnsupportedOperationException("不支持打印操作");
    }
}
