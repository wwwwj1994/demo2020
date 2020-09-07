package dubbodemo.demo.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wj
 * @date 2020/9/6 - 23:46
 */
public class JDKProxy implements InvocationHandler {

    private IPerson iPerson;
    public IPerson getInstance(IPerson iPerson) {
        this.iPerson = iPerson;
        Class<? extends IPerson> aClass = iPerson.getClass();

        return (IPerson) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.iPerson,args);
        after();
        return null;
    }

    private void before() {
        System.out.println("111");
    }

    private void after() {
        System.out.println("2222");
    }
}
