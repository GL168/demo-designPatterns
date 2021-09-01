# designPatterns-demo
23种设计模式

<table>
   <th>分类</th><th>设计模式</th><th>优点</th><th>缺点</th>
   <tr>
     <td rowspan="4">创建(create)型设计模式<br>（简单来说就是用来创建对象的）</td>
     <td>工厂/抽象工厂模式（Factory Pattern）</td>
     <td>1.不同条件下创建不同实例 2.产品标准化，生产更高效 3.封装创建细节</td>
     <td>1.类的个数增多，增加复杂度 2.增加了系统的抽象性和理解难度</td>
   </tr>
   <tr>
     <td>单例模式（Singleton Pattern）</td>
     <td>1.保证一个类仅有一个实例，并且提供一个全局访问点	2.保证内存里只有一个实例，减少了内存的开销。3.避免资源多重占用 4.优化共享资源访问</td>
     <td>1.一般没有接口，扩展困难，需要扩展则要修改源码，违背了开闭原则 2.在并发测试中不利于代码调试 3.单例模式的功能代码通常写在一个类中，如果功能设计不合理，则很容易违背单一职责原则。</td>
   </tr>
   <tr>
     <td>原型模式（Prototype Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>建造者模式（Builder Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td rowspan="7">结构(structure)型设计模式<br>（关注类和对象的组合）</td>
     <td>代理模式（Proxy Pattern）</td>
     <td>1.为其他对象提供一种代理以控制对这个对象的访问 2.代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度，增加了程序的可扩展性</td>
     <td>1.代理模式会造成系统设计中类的数量增加2.在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；3.增加了系统的复杂度</td>
   </tr>
   <tr>
     <td>外观模式（Facade Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>装饰器模式（Decorator Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>享元模式（Flyweight Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>组合模式（Composite Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>适配器模式（Adapter Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>桥接模式（Bridge Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td rowspan="10">行为(behavior)型设计模式<br>（关注对象之间的通信）</td>
     <td>模板模式（Template Pattern）</td>
     <td>1.定义一套流程模板，根据需要实现模板中的操作 2.流程全部标准化，需要微调请覆盖</td>
     <td>1.对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象，间接地增加了系统实现的复杂度。
         2.父类中的抽象方法由子类实现，子类的执行结果会影响父类的结果，反向控制结构，提高了代码阅读难度
         3.父类增加方法，子类必须实现</td>
   </tr>
   <tr>
     <td>策略模式（Strategy Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>   
   <tr>
     <td>责任链模式（Chain of Responsibility Pattern）</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>迭代器模式（Iterator Pattern）	</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>命令模式（Command Pattern）	</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>状态模式（State Pattern）		</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>中介者模式（Mediator Pattern）	</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>解释器模式（Interpreter Pattern）	</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>观察者模式（Observer Pattern）	</td>
     <td>-</td>
     <td>-</td>
   </tr>
   <tr>
     <td>访问者模式（Visitor Pattern）	</td>
     <td>-</td>
     <td>-</td>
   </tr>
    <tr>
     <td></td>
     <td>委派模式（Delegate Pattern）	</td>
     <td>-</td>
     <td>-</td>
   </tr>
</table>