package a.b.c.memento;

/**
 * 备忘录模式
 */
public class Client {

    public static void main(String[] args) {
        Emp emp = new Emp("张三", 18, 10000);
        System.out.println("第一次打印：" + emp.getInfo());

        // 进行备忘操作
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(emp.memento());

        emp.ename = "lisi";
        emp.age = 30;
        emp.salary = 20000;
        System.out.println("第二次打印：" + emp.getInfo());

        // 进行恢复
        emp.recovery(careTaker.getMemento());

        System.out.println("第三次打印：" + emp.getInfo());
    }
}
