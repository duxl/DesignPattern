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