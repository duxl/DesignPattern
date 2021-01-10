package a.b.c.bridge;

public class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}

// 桌面电脑（台式机）
class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

// 笔记本
class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
