package a.b.c.chain;

/**
 * 经理类
 */
public class Manager extends Leader {


    public Manager(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveRequest request) {
        if(request.leaveDays < 10) {
            System.out.println(String.format("员工：%s请假，天数：%d，理由：%s", request.empName, request.leaveDays, request.reason));
            System.out.println(String.format("经理：%s，审批通过", name));
        } else {
            if(nextLeader != null) {
                nextLeader.handRequest(request);
            }
        }
    }
}
