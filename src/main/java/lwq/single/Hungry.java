package lwq.single;

/**
 * @Projectname: designMode
 * @Filename: Hungry
 * @Author: LWQ
 * @Data: 2025/2/9 12:58
 * @Description:
 *     单例模式（饿汉式）： 一个类只有一个实例，且该类能自行创建这个实例的一种模式
 *         ①单例类只有一个实例对象
 *
 *         ②该单例对象必须由单例类自行创建
 *
 *         ③单例类对外提供一个访问该单例的全局访问点
 *
 *         ④、优点
 *                 单例模式可以保证内存里只有一个实例，减少了内存的开销。
 *                 可以避免对资源的多重占用。
 *                 单例模式设置全局访问点，可以优化和共享资源的访问。
 *         ⑤、缺点
 *                 单例模式一般没有接口，扩展困难。
 *                 单例模式的功能代码通常写在一个类中，如果功能设计不合理，则很容易违背单一职责原则
 * ————————————————
 *
 */

public class Hungry {

    private static final Hungry HUNGRY = new Hungry();
    public static Hungry getInstance() {
        return HUNGRY;
    }

    private Hungry() {}
}
