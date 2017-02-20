/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivejava.objectcreateanddestory;

/**
 *
 * @author wormz<br/>
 * 静态工厂方法特点<br/>
 * 1、构造器有名称，可以显示其功能<br/>
 * 2、对象单一不会重复创建对象<br/>
 * 3、返回对象可以为任何的子类型<br/>
 * 4、参数化类型实例的代码简洁<br/>
 */
public class StaticFactory {

    //boolean类型返回为Boolean集装箱型对象
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    //返回对象实现累加
    public static Long valueOf(long[] ls) {
        long sum = 0l;
        for (long l : ls) {
            sum += l;
        }
        return sum;
    }

    //服务入口
    public interface Service {

        Long getSum(long[] arrays);
    }

    public class MathService implements Service {

        @Override
        public Long getSum(long[] arrays) {
            return StaticFactory.valueOf(arrays);
        }

    }

    //供应者入口
    public interface Provider {

        Service newMathService();
    }

    public class MathProvider implements Provider {

        @Override
        public Service newMathService() {
            return new MathService();
        }

    }

}
