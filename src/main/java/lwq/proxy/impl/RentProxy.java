package lwq.proxy.impl;

import lwq.proxy.Rent;

/**
 * @Projectname: designMode
 * @Filename: RentProxy
 * @Author: LWQ
 * @Data: 2025/2/9 14:07
 * @Description:
 *  静态代理模式：
 *     角色分析：
 *         1、抽象角色：一般会使用接口或抽象类来解决
 *         2、真实角色：被代理的角色
 *         3、代理角色：代理真实角色，代理真实角色后我们会进行一些附属操作
 *         4、访问角色：访问代理对象的人
 * ————————————————
 *
 */

public class RentProxy implements Rent {

    private Rent rent;

    public RentProxy() {}

    public RentProxy(Rent rent) {
        this.rent = rent;
    }

    @Override
    public void rent() {
        proxyBefore();
        rent.rent();
        proxyAfter();
    }

    private void proxyBefore() {
        // do somthing
    }

    private void proxyAfter() {
        // do somthing
    }
}
