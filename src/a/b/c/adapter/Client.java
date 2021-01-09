package a.b.c.adapter;

/**
 * 测试适配器模式
 * 生活中的例子：一个ps/2的键盘在只有usb接口的笔记本上使用，中间需要使用usb转ps/2的转接线，这个转接线就是一个适配器
 */
public class Client {

    public static void main(String[] args) {
        Adpatee a = new Adpatee();
        Target t = new Adapter(a);
        t.handleReq();
    }
}
