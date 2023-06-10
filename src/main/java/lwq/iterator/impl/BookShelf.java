package lwq.iterator.impl;

import lwq.iterator.Aggregate;
import lwq.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: designMode
 * @Filename: BookShelf
 * @Author: LWQ
 * @Data:2023/6/10 09:50
 * @Description: 具体集合对象
 */

public class BookShelf<E> implements Aggregate {
    List<E> elementData;

    public BookShelf() {
        elementData = new ArrayList<>();
    }

    public BookShelf(int capacity) {
        elementData = new ArrayList<>(capacity);
    }

    public boolean add(E e) {
        return this.elementData.add(e);
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public int size() {
        return elementData.size();
    }

    public E getByIndex(int index) {
        if (index > elementData.size()) {
            throw new IndexOutOfBoundsException();
        }
        return elementData.get(index);
    }
}
