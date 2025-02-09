package lwq.observer.impl;

import lwq.observer.Observer;
import lwq.observer.Subject;

/**
 * @Projectname: designMode
 * @Filename: Subject1
 * @Author: LWQ
 * @Data: 2025/2/9 15:42
 * @Description:
 *      观察者模式 - 具体观察者
 */

public class Subject1 extends Subject {
    @Override
    protected void notice() {
        for (Observer o : obs) {
            o.response();
        }
    }
}
