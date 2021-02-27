package a.b.c.mediator;

/**
 * 研发部
 */
public class Development implements IDepartment {

    private IMediator m;// 持有总经理（中介者）的引用

    public Development(IMediator m) {
        this.m = m;
        m.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("开发部专心科研，开发项目");
    }

    @Override
    public void outAction() {
        System.out.println("开发部汇报工作！没钱了，需要资金支持！");
        m.command("finacial"); // 向总经理（中介者）发出资金申请的需求
    }
}
