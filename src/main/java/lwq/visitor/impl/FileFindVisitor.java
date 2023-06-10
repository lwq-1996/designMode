package lwq.visitor.impl;

import lwq.visitor.Entry;
import lwq.visitor.Visitor;

import java.util.Iterator;

/**
 * @Projectname: designMode
 * @Filename: FileFindVisitor
 * @Author: LWQ
 * @Data:2023/6/10 12:54
 * @Description:
 */

public class FileFindVisitor extends Visitor {
    // 当前目录结构
    private String currentDir = "";

    @Override
    public void visitor(File file) {

    }

    @Override
    public void visitor(Directory directory) {

    }

    @Override
    public void visitor(File file, String suffix) {
        if (suffix == null) {
            throw new IllegalArgumentException();
        }

        if (file.getName().endsWith("." + suffix)) {
            System.out.println(currentDir + java.io.File.separator + file.getName());
        }
    }

    @Override
    public void visitor(Directory directory, String suffix) {
        if (suffix == null) {
            throw new IllegalArgumentException();
        }

        String savedir = currentDir;
        currentDir = currentDir + java.io.File.separator + directory.getName();

        Iterator iterable = directory.iterable();
        while (iterable.hasNext()) {
            Entry entry = (Entry) iterable.next();
            entry.accept(this, suffix);
        }

        currentDir = savedir;
    }
}
