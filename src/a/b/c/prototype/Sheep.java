package a.b.c.prototype;

import java.util.Date;

/**
 * 浅克隆
 */
public class Sheep implements Cloneable { // 1997,英国的克隆羊，多利
    public String name;
    public Date birthday;

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void say() {
        String str = "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
        System.out.println(str);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }
}
