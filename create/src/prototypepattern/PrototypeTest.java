package prototypepattern;

/**
 * 原型模式
 * 抽象原型类：规定了具体原型对象必须实现的接口。
 * 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * 访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 * 原型模式克隆分为
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *
 * @author gulin
 * @date 2021/9/2 13:51
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        //案例1
//        Realizetype obj1 = new Realizetype();
//        Realizetype obj2 = (Realizetype) obj1.clone();
//        System.out.println("obj1==obj2?" + (obj1 == obj2));
        //案例2
        citation obj1 = new citation("张三", "同学：在2021学年第一学期中表现优秀，被评为三好学生。", "IT学院");
        obj1.display();
        citation obj2 = (citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}

//案例一： 具体原型类
class Realizetype implements Cloneable {
    Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}

//案例二：奖状类
class citation implements Cloneable {
    String name;
    String info;
    String college;
    citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return (this.name);
    }
    void display() {
        System.out.println(name + info + college);
    }
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (citation) super.clone();
    }
}
