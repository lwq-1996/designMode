package lwq.visitor.impl;

import lwq.visitor.Visitor;
import lwq.visitor.Entry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Projectname: designMode
 * @Filename: Directory
 * @Author: LWQ
 * @Data:2023/6/10 12:19
 * @Description: 元素具体子类实现
 */

public class Directory extends Entry {
    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public boolean add(Entry entry) {
        return dir.add(entry);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return dir.size();
    }

    public Iterator iterable() {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    @Override
    public void accept(Visitor visitor, String suffix) {
        visitor.visitor(this, suffix);
    }
}
