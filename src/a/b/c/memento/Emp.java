package a.b.c.memento;

import com.sun.jdi.event.ThreadStartEvent;

/**
 * 源发器类
 */
public class Emp {

    public String ename;
    public int age;
    public double salary;

    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    // 进行备忘操作
    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    // 进行数据恢复
    public void recovery(EmpMemento mmt) {
        this.ename = mmt.ename;
        this.age = mmt.age;
        this.salary = mmt.salary;
    }


    public String getInfo() {
        return "ename=" + ename +
                ", age=" + age +
                ", salary=" + salary;
    }
}
