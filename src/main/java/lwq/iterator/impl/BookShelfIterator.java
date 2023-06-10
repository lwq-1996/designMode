package lwq.iterator.impl;

import lwq.iterator.Iterator;

import java.util.NoSuchElementException;

/**
 * @Projectname: designMode
 * @Filename: BookShelfIterator
 * @Author: LWQ
 * @Data:2023/6/10 09:50
 * @Description: BookShelf专用迭代器，迭代具体实现在此接口进行实现
 */

public class BookShelfIterator<E> implements Iterator {
    BookShelf<E> bookShelf;
    int cursor;
    int size;

    public BookShelfIterator(BookShelf bookShelf) {
        cursor = 0;
        size = bookShelf.size();
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean haseNext() {
        return cursor < size;
    }

    @Override
    public E next() {
        if (this.bookShelf == null) {
            throw new RuntimeException("this bookShelf has not element!");
        }

        int var1 = cursor;
        if (var1 >= size) {
            throw new NoSuchElementException();
        }
        cursor = var1 + 1;
        return bookShelf.getByIndex(var1);
    }
}
