package adapterpattern;

import java.lang.reflect.Method;

/**
 * 适配器模式
 * 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *
 * @author gulin
 * @date 2021/9/2 16:37
 */
public class MotorAdapterTest {
    public static void main(String[] args) throws Exception {
        System.out.println("适配器模式测试：");
        Class clazz = Class.forName(OpticalAdapter.class.getTypeName());
        Object obj = clazz.newInstance();
        Method methodBook = clazz.getDeclaredMethod("drive");
        methodBook.setAccessible(true);
        methodBook.invoke(obj);

//        Motor motor = new ElectricAdapter();
//        motor.drive();
//        motor = new OpticalAdapter();
//        motor.drive();
    }
}

//目标：发动机
interface Motor {
    public void drive();
}

//适配者1：电能发动机
class ElectricMotor {
    public void electricDrive() {
        System.out.println("电能发动机驱动汽车！");
    }
}

//适配者2：光能发动机
class OpticalMotor {
    public void opticalDrive() {
        System.out.println("光能发动机驱动汽车！");
    }
}

//电能适配器
class ElectricAdapter implements Motor {
    private ElectricMotor emotor;

    public ElectricAdapter() {
        emotor = new ElectricMotor();
    }

    public void drive() {
        emotor.electricDrive();
    }
}

//光能适配器
class OpticalAdapter implements Motor {
    private OpticalMotor omotor;

    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }

    public void drive() {
        omotor.opticalDrive();
    }
}