package factorypattern.abstractfactory;

/**
 * 抽象工厂信息
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
 * 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系
 * @author gulin
 * @date 2021/8/31 14:49
 */
public class FarmTest {

    public static void main(String[] args) {
        SGfarm sGfarm = new SGfarm();
        sGfarm.newAnimal();
        sGfarm.newPlant();
        System.out.println("=========快乐的分割线==============");
        SRfarm sRfarm = new SRfarm();
        sRfarm.newAnimal();
        sRfarm.newPlant();
    }
}

//抽象产品：动物类
interface Animal {
    public void show();
}

//抽象产品：植物类
interface Plant {
    public void show();
}

//具体产品：马类
class Horse implements Animal {
    @Override
    public void show() {
        System.out.println("马儿小丽丽");
    }
}

//具体产品：牛类
class Cattle implements Animal {
    @Override
    public void show() {
        System.out.println("牛儿小皮皮");
    }
}

//具体产品：水果类
class Fruitage implements Plant {
    @Override
    public void show() {
        System.out.println("西瓜");
    }
}

//具体产品：蔬菜类
class Vegetables implements Plant {
    @Override
    public void show() {
        System.out.println("空心菜");
    }
}

//抽象工厂：农场类
interface Farm {
    public Animal newAnimal();

    public Plant newPlant();
}

//具体工厂：韶关农场类
class SGfarm implements Farm {

    @Override
    public Animal newAnimal() {
        System.out.print("新马儿出生了，名字叫：");
        Horse horse = new Horse();
        horse.show();
        return horse;
    }

    @Override
    public Plant newPlant() {
        System.out.print("最爱吃的水果是：");
        Fruitage fruitage = new Fruitage();
        fruitage.show();
        return fruitage;
    }
}

//具体工厂：上饶农场类
class SRfarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.print("新牛儿出生了，名字叫：");
        Cattle cattle = new Cattle();
        cattle.show();
        return cattle;
    }

    @Override
    public Plant newPlant() {
        System.out.print("最爱吃的蔬菜是：");
        Vegetables vegetables = new Vegetables();
        vegetables.show();
        return vegetables;
    }
}
