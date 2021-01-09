# 设计模式

## [单例模式](src/a/b/c/singleton)

[饿汉式](src/a/b/c/singleton/Test01.java) （线程安全，调用效率高。但是不能延迟加载）

[懒汉式](src/a/b/c/singleton/Test02.java) （线程安全，调用效率不高。但是可以延迟加载）

[双重检测锁](src/a/b/c/singleton/Test03.java) （由于JVM底层内部模型原因，偶尔会出问题，**不建议使用**）

[静态内部类](src/a/b/c/singleton/Test04.java) （线程安全，调用效率高，可以延迟加载）

[枚举](src/a/b/c/singleton/Test05.java) （线程安全，调用效率高，不能延迟加载。天然防止发射和反序列化）



# [工厂模式](/src/a/b/c/factor)

[简单工厂](/src/a/b/c/factor/simple) （如果新增实现，需要修改代码，违背开闭原则，但实际使用最多）

[工厂方法](/src/a/b/c/factor/method) （如果新增实现，只需要新增对应的工厂即可，满足开闭原则，但类的数量较多）

[抽象工厂](/src/a/b/c/factor/abstractt) （不可以增加产品，可以增加产品族） 





## [代理模式](/src/a/b/c/proxy)

[静态代理](/src/a/b/c/proxy/stati)

[动态代理](/src/a/b/c/proxy/dynamic)