package lwq.visitor.impl;

import lwq.visitor.Visitor;
import lwq.visitor.Entry;

import java.util.Iterator;

/**
 * @Projectname: designMode
 * @Filename: ListVisitor
 * @Author: LWQ
 * @Data:2023/6/10 12:20
 * @Description: 具体的访问器实现，提供遍历输出功能
 */

public class ListVisitor extends Visitor {
    // 当前目录结构
    private String currentDir = "";

    @Override
    public void visitor(File file) {
        System.out.println(currentDir + java.io.File.separator + file.getName());
    }

    @Override
    public void visitor(Directory directory) {
        String savedir = currentDir;
        currentDir = currentDir + java.io.File.separator + directory.getName();
        System.out.println(currentDir);

        Iterator iterable = directory.iterable();
        while (iterable.hasNext()) {
            Entry entry = (Entry) iterable.next();
            entry.accept(this);
        }

        currentDir = savedir;
    }
}
