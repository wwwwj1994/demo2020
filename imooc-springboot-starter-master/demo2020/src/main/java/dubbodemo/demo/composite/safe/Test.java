package dubbodemo.demo.composite.safe;

/**
 * @author wj
 * @date 2020/9/8 - 22:36
 */
public class Test {

    public static void main(String[] args) {
        Direcotry QQ = new MyFile("QQ");
        Direcotry WX = new MyFile("WX");
        Folder d1 = new Folder("test",2);

        Direcotry word = new MyFile("word");
        Direcotry excel = new MyFile("excel");
        d1.add(word);
        d1.add(excel);
        Folder d2 = new Folder("D://",1);
        d2.add(QQ);
        d2.add(WX);
        d2.add(d1);

        d2.show();
    }
}
