package lwq.decorator;

/**
 * @Projectname: designMode
 * @Filename: Decorator
 * @Author: LWQ
 * @Data: 2025/2/9 15:22
 * @Description:
 *      装饰者模式 - 抽象构件
 */

public abstract class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void drink() {
        drink.drink();
    }
}
