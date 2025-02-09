package lwq.decorator.impl;

import lwq.decorator.Decorator;
import lwq.decorator.Drink;

/**
 * @Projectname: designMode
 * @Filename: Chocolate
 * @Author: LWQ
 * @Data: 2025/2/9 15:27
 * @Description:
 *      装饰者模式 - 具体装饰器
 *
 *      装饰者模式：动态的将新功能附加到对象上。在对象功能的拓展方面，比继承更有弹性。同时装饰者模式也体现了开闭原则
 *         1、抽象构件(Component)角色:定义一个抽象接口以规范准备接收附加责任的对象。
 *         2、具体构件(ConcreteComponent)角色:实现抽象构件，通过装饰角色为其添加一些职责。
 *         3、抽象装饰(Decorator)角色:继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 *         4、具体装饰(ConcreteDecorator)角色:实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * ————————————————
 *
 */

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public void drink(){
        before();
        super.drink();
        after();
    }

    private void before() {

    }

    private void after() {

    }

    public static void main(String[] args) {
        Drink drink = new Juice();
        drink = new Chocolate(drink);
        drink.drink();
    }
}
