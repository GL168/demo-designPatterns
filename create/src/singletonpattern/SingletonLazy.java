package singletonpattern;

/**
 *  单例应用实例
 * 需要频繁创建的一些类，使用单例可以降低系统的内存压力，减少 GC。
 * 某类只要求生成一个对象的时候，如一个班中的班长、每个人的身份证号等。
 * 某些类创建实例时占用资源较多，或实例化耗时较长，且经常使用。
 * 某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。
 * 频繁访问数据库或文件的对象。
 * 对于一些控制硬件级别的操作，或者从系统上来讲应当是单一控制逻辑的操作，如果有多个实例，则系统会完全乱套。
 * 当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。
 * @author gulin
 * @date 2021/9/1 11:23
 */
public class SingletonLazy {

    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2 = President.getInstance();
        zt2.getName();    //输出总统的名字
        if (zt1 == zt2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }

}

class President {
    private static volatile President instance = null;    //保证instance在所有线程中同步
    //private避免类在外部被实例化
    private President() {
        System.out.println("产生一个总统！");
    }
    public static synchronized President getInstance() {
        //在getInstance方法上加同步
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }
    public void getName() {
        System.out.println("我是美国总统：特朗普。");
    }
}
