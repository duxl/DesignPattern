package a.b.c.chain;

/**
 * <pre>
 * 测试责任链：
 *
 * 定义：将能够处理同一类请求的对象连成一条链，所提交的请求沿着链传递，
 * 链上的对象逐个判断是否有能力处理该请求，如果能则处理，如果不能则传
 * 递给链上的下一个对象
 *
 * 例子：公司里面请假审批过程
 * 如果请假天数小于3天，主任审批
 * 如果请假天数大于等于3天，小于10天，经理审批
 * 如果大于等于10天，小于30天，总经理审批
 * 如果大于30天，提示拒绝
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        // 组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        // 开始请假操作
        LeaveRequest request = new LeaveRequest("TOM", 10, "回英国老家探亲");
        a.handRequest(request);

        /**
         * ps: 这里使用链表的方式定义责任链，还可以通过结合、数组生成责任链更佳适用！
         * 实际上很多项目中，每个具体的Handler并不是由开发团队定义的，而是项目上线后
         * 由外部单位追加的，所以使用链表方式定义COR链就很困难
         */
    }
}
