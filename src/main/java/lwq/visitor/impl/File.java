package lwq.visitor.impl;

import lwq.visitor.Visitor;
import lwq.visitor.Entry;

/**
 * @Projectname: designMode
 * @Filename: File
 * @Author: LWQ
 * @Data:2023/6/10 12:19
 * @Description: 元素具体子类实现
 */

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
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
