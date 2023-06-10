package lwq.visitor;

import lwq.visitor.impl.Directory;
import lwq.visitor.impl.File;

/**
 * @Projectname: designMode
 * @Filename: Visitor
 * @Author: LWQ
 * @Data:2023/6/10 11:37
 * @Description: 访问器顶级接口，提供了访问方法，具体实现需由子类实现
 */

public abstract class Visitor {
    public abstract void visitor(File file);
    public abstract void visitor(Directory directory);
    public void visitor(File file, String suffix) {};
    public void visitor(Directory directory, String suffix) {};

}
