package lwq;

import lwq.iterator.Iterator;
import lwq.iterator.impl.BookShelf;
import lwq.iterator.po.Book;
import org.junit.jupiter.api.Test;

/**
 * @Projectname: designMode
 * @Filename: Iterator_Test
 * @Author: LWQ
 * @Data:2023/6/10 09:58
 * @Description: 迭代器模式debug
 */

public class Iterator_Test {

    @Test
    public void test01() {
        BookShelf<Book> bookShelf = new BookShelf<>();
        bookShelf.add(new Book("A"));
        bookShelf.add(new Book("B"));
        bookShelf.add(new Book("C"));
        bookShelf.add(new Book("D"));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.haseNext()) {
            Book next = iterator.next();
            System.out.println(next.getBookName());
        }
    }
}
