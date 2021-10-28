package com.javarush.task.task32.task3205;

import java.lang.reflect.Proxy;

/* 
Создание прокси-объекта
*/

public class Solution {
    public static void main(String[] args) {
        SomeInterfaceWithMethods obj = getProxy();
        obj.stringMethodWithoutArgs();
        obj.voidMethodWithIntArg(1);
    }

    public static SomeInterfaceWithMethods getProxy() {
        SomeInterfaceWithMethods original = new SomeInterfaceWithMethodsImpl();
        ClassLoader classLoader = SomeInterfaceWithMethods.class.getClassLoader();
        Class[] interfaces = {SomeInterfaceWithMethods.class};
        CustomInvocationHandler handler = new CustomInvocationHandler(original);
        return (SomeInterfaceWithMethods) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
