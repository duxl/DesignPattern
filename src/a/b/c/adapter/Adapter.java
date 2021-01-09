package a.b.c.adapter;

/**
 * 适配器（相当于usb和ps/2转接器）
 */
public class Adapter implements Target {

    private Adpatee adpatee;

    public Adapter(Adpatee adpatee) {
        this.adpatee = adpatee;
    }

    @Override
    public void handleReq() {
        adpatee.request();
    }
}
