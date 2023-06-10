package lwq.visitor;

/**
 * @Projectname: designMode
 * @Filename: Element
 * @Author: LWQ
 * @Data:2023/6/10 11:37
 * @Description: 元素顶级接口，提供了接受访问的方法 accpet
 */

public interface Element {
    public abstract void accept(Visitor visitor);
    public abstract void accept(Visitor visitor, String suffix);
}
