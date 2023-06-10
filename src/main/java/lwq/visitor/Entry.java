package lwq.visitor;

import java.util.Iterator;

/**
 * @Projectname: designMode
 * @Filename: Entry
 * @Author: LWQ
 * @Data:2023/6/10 12:19
 * @Description: 具体元素的上层接口，继承了顶层接口的接受访问方法，同时提供了一些其他功能方法
 */

public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();

    public boolean add(Entry entry) {
        // 父类方法，由具体子类实现
        throw new RuntimeException("add none");
    }

    public Iterator iterator() {
        // 父类方法，由具体子类实现
        throw new RuntimeException("iterator none");
    }

}
