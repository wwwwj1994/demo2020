package dubbodemo.demo.iterator;

import java.util.List;

/**
 * @author wj
 * @date 2020/9/11 - 23:36
 */
public class MyIterator<E> implements Iterator<E>{

    private List<E> list;

    private int cursor;

    private E element;

    public MyIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前游标位置:" + cursor);
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }
}
