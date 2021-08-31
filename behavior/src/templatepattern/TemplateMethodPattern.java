package templatepattern;

/**
 * 模板方法模式
 * 抽象方法：在抽象类中声明，由具体子类实现。
 * 具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它。
 * 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
 * @author gulin
 * @date 2021/8/31 15:29
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}

//抽象类
abstract class AbstractClass {
    //模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    //抽象方法1
    public abstract void abstractMethod1();

    //抽象方法2
    public abstract void abstractMethod2();

}

//具体子类
class ConcreteClass extends AbstractClass {

//    @Override
//    public void SpecificMethod() {
//        super.SpecificMethod();
//    }

    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}