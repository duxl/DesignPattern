package a.b.c.prototype;

import java.util.Date;

/**
 * 深克隆
 */
public class Sheep02 implements Cloneable { // 1997,英国的克隆羊，多利
    public String name;
    public Date birthday;

    public Sheep02() {
    }

    public Sheep02(String name, Date birthday) {
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

    /**
     * 这里使用object的clone实现的克隆，使用序列化和反序列化也可以实现深克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        // 添加如下代码实现深克隆（deep clone）
        Sheep02 s = (Sheep02) obj;
        s.birthday = (Date) this.birthday.clone(); // 把属性也进行克隆

        return obj;
    }
}
