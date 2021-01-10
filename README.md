# 设计模式

## [单例模式](src/a/b/c/singleton)

[饿汉式](src/a/b/c/singleton/Test01.java) （线程安全，调用效率高。但是不能延迟加载）

[懒汉式](src/a/b/c/singleton/Test02.java) （线程安全，调用效率不高。但是可以延迟加载）

[双重检测锁](src/a/b/c/singleton/Test03.java) （由于JVM底层内部模型原因，偶尔会出问题，**不建议使用**）

[静态内部类](src/a/b/c/singleton/Test04.java) （线程安全，调用效率高，可以延迟加载）

[枚举](src/a/b/c/singleton/Test05.java) （线程安全，调用效率高，不能延迟加载。天然防止发射和反序列化）



## [工厂模式](/src/a/b/c/factory)

[简单工厂](/src/a/b/c/factory/simple) （如果新增实现，需要修改代码，违背开闭原则，但实际使用最多）

[工厂方法](/src/a/b/c/factory/method) （如果新增实现，只需要新增对应的工厂即可，满足开闭原则，但类的数量较多）

[抽象工厂](/src/a/b/c/factory/abstractt) （不可以增加产品，可以增加产品族） 



## [构建者模式](/src/a/b/c/builder)

**白话文解说什么是构建者模式：**

 一个大产品（飞船-AirShip）包含很多的小产品（引擎-Engine、逃逸塔-EscapeTower、轨道舱-OrbitalModule） 

*1、先用一个构建器（AirShipBuilder）构建各个小产品，* 

*2、然后将这个构建器传给组装器（AirShipDirector）进行组装* 

*3、最后通过这个组装器拿到组装后的大产品*



## [原型模式](/src/a/b/c/prototype)（克隆模式）

原型模式的深克隆有两种方式实现：1使用Object的clone()方法；2使用序列化和反序列化

ps：通过new一个对象很耗时，或者平凡的new对象后很快释放对象的情况，可以考虑使用原型模式

```java
// Android中下面代码，内部就用了原型模式，复用Messge减少平凡创建对象
Message msg = handler.obtainMessage()
```



## [适配器模式](/src/a/b/c/adapter)



## [代理模式](/src/a/b/c/proxy)

[静态代理](/src/a/b/c/proxy/stati)

[动态代理](/src/a/b/c/proxy/dynamic)



## [桥连模式](/src/a/b/c/bridge)

白话文理解桥连模式，生活中的例子：电脑的类型有台式机、笔记本、平板，而电脑又分品牌联想、戴尔等等。常规我们建类的方式就像下图一样

![not_bridge](/pics/not_bridge.png)

这样设计对于扩展是有问题的，如果新增了一个类型比如手机，需要在手机下面添加各个品牌，反之如果要添加一个品牌华硕，需要在所有类型下添加华硕，为了解决这个问题，就有了桥连模式

桥连模式是用组合的方式，一台电脑包含类型和品牌，通过一个中间类将类型和品牌联系在一起

*（ps：本人好像对**侨联模式**和**构建者模式**有点分不清了）*



## [装饰模式](/src/a/b/c/decorator) 

**特点：** 动态的为一个对象增加新的功能，无须通过继承增加子类就能扩展对象的新功能

**实现：** 接口A、具体类M、装饰器N

M实现接口A，N持有M的引用同时也实现接口A，N实现接口A的的时候调用了M引用的实现



## [外观模式](/src/a/b/c/facade)

就是面向对象编程的封装，一个功能需要调用很多方法步骤，把这些步骤封装到一个api中，这种方式就是外观模式

