package lwq.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Projectname: designMode
 * @Filename: Subject
 * @Author: LWQ
 * @Data: 2025/2/9 15:40
 * @Description:
 *      观察者模式 - 抽象目标
 */

public abstract class Subject {
    protected final List<Observer> obs = new ArrayList<>();

    public void add(Observer observer) {
        obs.add(observer);
    }

    public void remove(Observer observer) {
        obs.remove(observer);
    }

    protected abstract void notice();

}
