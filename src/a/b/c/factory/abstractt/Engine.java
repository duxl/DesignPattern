package a.b.c.factory.abstractt;

// 发动机接口
public interface Engine {
    void run();
    void start();
}

// 高端发动机
class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("跑得快");
    }

    @Override
    public void start() {
        System.out.println("启动快，可以自动启停");
    }
}

// 低端发动机
class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢，不能自动启停");
    }
}
