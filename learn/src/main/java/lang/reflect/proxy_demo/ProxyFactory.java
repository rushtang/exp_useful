package lang.reflect.proxy_demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tangmaoheng
 * @createTime 2019年12月26日 11:03:00
 */
public class ProxyFactory {
    public static Object getProxy(final Class clazz) {
        //参数一：被代理对象的类加载器，固定写法
        //参数二：被代理对象实现的接口，固定写法
        //参数三：使用的是策略模式，固定写法,如何调用真实对象的方法
        Object obj =  Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
            @Override
            //代理对象调用的任何方法都会触发此方法执行
            //参数一：代理对象本身的引用，一般不用
            //参数二：代理对象调用的方法
            //参数三：代理对象调用的方法的参数
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //前置增强
                args[0]=Double.parseDouble(args[0]+"")/2;

                method.invoke(clazz.newInstance(), args[0]);//调用真实对象中的方法
                //后置增强
                System.out.println("后置增强！！！");
                return null;
            }
        });

        return obj;
    }
}