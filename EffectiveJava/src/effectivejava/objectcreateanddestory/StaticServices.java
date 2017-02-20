/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivejava.objectcreateanddestory;

import effectivejava.objectcreateanddestory.StaticFactory.Provider;
import effectivejava.objectcreateanddestory.StaticFactory.Service;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author wormz
 */
public class StaticServices {

    //控制构造方法不让外部使用
    private StaticServices() {
    }
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    //服务注册
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    //获取服务新实例
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name:" + name);
        }
        return p.newMathService();
    }

}
