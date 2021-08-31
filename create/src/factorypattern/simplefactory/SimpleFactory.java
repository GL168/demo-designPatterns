package factorypattern.simplefactory;

/**
 * 简单工厂模式
 * 简单工厂（SimpleFactory）：是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
 * 抽象产品（Product）：是简单工厂创建的所有对象的父类，负责描述所有实例共有的公共接口。
 * 具体产品（ConcreteProduct）：是简单工厂模式的创建目标。
 * @author gulin
 * @date 2021/8/31 13:56
 */
public class SimpleFactory {

    public static void main(String[] args) {
        Simple.makeProduct(1);
    }
}

//工厂接口
interface Product {
    void show();
}

class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("ConcreteProduct1产品信息A");
    }
}

class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("ConcreteProduct2产品信息B");
    }
}

//简单工厂
class Simple {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case 1:
                ConcreteProduct1 concreteProduct1 = new ConcreteProduct1();
                concreteProduct1.show();
                return concreteProduct1;
            case 2:
                ConcreteProduct2 concreteProduct2 = new ConcreteProduct2();
                concreteProduct2.show();
                return concreteProduct2;
        }
        return null;
    }
}

