package a.b.c.prototype;

import java.util.Date;

/**
 * 测试原型模式（深克隆）
 */
public class Client02 {

    public static void main(String[] args) throws Exception {
        Sheep02 duoLi = new Sheep02("多利", new Date(123456456456L));

        Sheep02 shaoLi = (Sheep02) duoLi.clone();
        shaoLi.name = "少利";
        shaoLi.birthday.setTime(142456489789L); // 少利的修改不会影响到多利

        duoLi.say();
        shaoLi.say();
    }
}
