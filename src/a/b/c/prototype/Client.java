package a.b.c.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Sheep duoLi = new Sheep("多利", new Date(123456456456L));

        Sheep shaoLi = (Sheep) duoLi.clone();
        shaoLi.name = "少利";
        shaoLi.birthday.setTime(142456489789L); // 少利的修改会影响到多利

        duoLi.say();
        shaoLi.say();
    }
}
