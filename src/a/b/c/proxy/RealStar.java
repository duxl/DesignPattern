package a.b.c.proxy;

/**
 * 真正的明星实现类
 */
public class RealStar implements Star {

    @Override
    public void sing() {
        System.out.println("真正的明星RealStar唱歌");
    }
}
