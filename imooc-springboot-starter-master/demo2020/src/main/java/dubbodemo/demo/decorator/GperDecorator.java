package dubbodemo.demo.decorator;

/**
 * @author wj
 * @date 2020/9/7 - 21:49
 * <p>
 * 根据鼓泡社区，根据权限不同然后展示出的标签不同
 */
public abstract class GperDecorator implements MyDecorator {

    /**
     * @autor wj
     * @work
     *
     * 优点：
     * 1、继承的扩展
     * 2、通过不同的装饰类的排列组合，产生不同效果
     * 3、遵循开闭原则
     *
     * 缺点：
     * 1、会出现更多的代码和类，增加程序复杂性
     * 2、动态装饰时，多层装饰时会更复杂
     *
     * 属于静态代理的一种
     */

    /**
     * 展示菜单
     *
     * @return string
     */
    @Override
    public abstract String showMenu();

//    /**
//     * 问答
//     * @return string
//     * */
//    public abstract String questionAndAnswer();
//
//    /**
//     * 文章
//     * @return string
//     * */
//    public abstract String theArticle();
//
//    /**
//     * 作业
//     * @return string
//     * */
//    public abstract String homeWork();
//
//
//    /**
//     * 成长墙
//     * @return string
//     * */
//    public abstract String theQuestionBank();
//
//    /**
//     * 精品课
//     * @return string
//     * */
//    public abstract String classQuality();
//
//
//    /**
//     * 冒泡
//     * @return string
//     * */
//    public abstract String theBubbling();
//
//
//    /**
//     * 商城
//     * @return string
//     * */
//    public abstract String mall();
}
