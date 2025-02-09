package lwq.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Projectname: designMode
 * @Filename: RentProxyInvocationHandler
 * @Author: LWQ
 * @Data: 2025/2/9 14:12
 * @Description:    动态代理模式
 */

public class RentProxyInvocationHandler<T> implements InvocationHandler {

    private T target;

    public RentProxyInvocationHandler() {}

    public RentProxyInvocationHandler(T target) {
        this.target = target;
    }

    public void proxyBefore() {
        // do something
    }

    public void proxyAfter() {
        // do something
    }

    public void setTarget(T target) {
        this.target = target;
    }

    public T getProxy() {
        return (T) Proxy.newProxyInstance(getClass().getClassLoader(), getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        proxyBefore();
        Object result = method.invoke(target, args);
        proxyAfter();
        return result;
    }

    public static void main(String[] args) {
        Mast mast = new Mast();
        RentProxyInvocationHandler<Mast> handler = new RentProxyInvocationHandler<>(mast);
        handler.getProxy().rent();
    }
}
