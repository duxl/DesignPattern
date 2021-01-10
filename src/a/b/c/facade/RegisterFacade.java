package a.b.c.facade;

public class RegisterFacade {

    public void regiest() {
        new GongShangJu().checkName();
        new ZhiJianJu().orgCodeCertificate();
        new ShuiWuJu().taxCertificate();
        new YinHang().openAccount();
    }
}
