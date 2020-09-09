package dubbodemo.demo.composite.transparent;

/**
 * @author wj
 * @date 2020/9/8 - 21:55
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("-----------------透明的组合模式---------");
        CourseComponet java = new Course("Java入门课程",8280);
        CourseComponet php = new Course("Php入门课程",1600);

        CourseComponet packer = new CoursePackage("java架构师", 2);

        CourseComponet design = new Course("Java设计模式",1500);
        CourseComponet source = new Course("源码分析",2000);
        CourseComponet softSkill = new Course("Java入门课程",3000);

        packer.addChild(design);
        packer.addChild(source);
        packer.addChild(softSkill);
        CourseComponet gp = new CoursePackage("gp课程", 1);
        gp.addChild(java);
        gp.addChild(php);
        gp.addChild(packer);
        System.out.println(((CoursePackage)gp).getList());
        gp.print();
    }
}
