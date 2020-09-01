package dubbodemo.demo.designpaterns.factory.simplefactorypattern;

import org.springframework.util.StringUtils;

/**
 * @author wj
 * @date 2020/9/1 - 21:11
 * 简单工厂
 */
public class SimpleFactory {

    /**
     * 简单工厂：当需要生产的对象比较少时，可以应用简单工厂
     * 1、生产对象：需要有共同特性-继承相同的类
     * 2、简单工厂不满足开闭原则，如果需要添加生产对象，则需要对SimpleFactory进行修改
     * 3、JDK自带的Calender类应用简单工厂
     */

    public Ainmal create(Class <? extends Ainmal>  className) {
//        if ("dog".equals(className)) {
//            return new Dog();
//        } else if ("cat".equals(className)) {
//            return new Cat();
//        } else {
//            return null;
//        }

//        try {
//            if (!StringUtils.isEmpty(className)){
//                return (Ainmal)Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
        if (className != null) {
            try {
                return className.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
