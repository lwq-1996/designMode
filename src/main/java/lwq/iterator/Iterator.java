package lwq.iterator;

/**
 * @Projectname: designMode
 * @Filename: Iterator
 * @Author: LWQ
 * @Data:2023/6/10 09:49
 * @Description: 迭代器顶层接口
 */

public interface Iterator<E> {

    boolean haseNext();

    E next();
}
