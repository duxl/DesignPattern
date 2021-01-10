package a.b.c.facade;

/**
 * 外观模式: 就是面向对象编程的封装，一个功能需要调用很多方法步骤，把这些步骤封装到一个api中，这种方式就是外观模式
 * 这里模拟注册公司的步骤：
 * 1、到工商局检查名字是否冲突
 * 2、到质监局办理组织结构代码证
 * 3、到税务局办理税务
 * 4、到银行开企业账户
 */
public class Client {

    public static void main(String[] args) {
        // 没有使用外观模式的情况
        /*
        new GongShangJu().checkName();
        new ZhiJianJu().orgCodeCertificate();
        new ShuiWuJu().taxCertificate();
        new YinHang().openAccount();
         */

        // 使用外观模式的情况
        new RegisterFacade().regiest();
    }
}
