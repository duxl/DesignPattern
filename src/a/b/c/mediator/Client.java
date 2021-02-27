package a.b.c.mediator;

/**
 * 现实生活中，一个公司的开发部和财务不能直接打交道，需要总经理在中间起协调工作
 * 开发部需要资金的时候不能直接向财务部拿，需要向总经理审批
 * 总经理就是【中介者】角色，开发部和财务部就是【同事】角色
 */
public class Client {

    public static void main(String[] args) {
        IMediator preisdent = new President(); // 总经理（中介者）

        IDepartment dev = new Development(preisdent); // 开发部
        IDepartment finacial = new Finacial(preisdent); // 财务部

        dev.selfAction(); // 开发部做自己的事情
        dev.outAction(); // 开发部向总经理（中介者）发出命令
    }
}
