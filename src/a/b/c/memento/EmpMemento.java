package a.b.c.memento;

/**
 * 备忘录类
 */
public class EmpMemento {

    public String ename;
    public int age;
    public double salary;

    public EmpMemento(Emp e) {
        this.ename = e.ename;
        this.age = e.age;
        this.salary = e.salary;
    }
}
