package a.b.c.mediator;

/**
 * 财务部
 */
public class Finacial implements IDepartment {

    private IMediator m;

    public Finacial(IMediator m) {
        this.m = m;
        m.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("财务部开始数钱了");
    }

    @Override
    public void outAction() {
        System.out.println("财务部汇报工作！钱太多了！怎么花？");
    }
}
