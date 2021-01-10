package a.b.c.chain;

/**
 * 主任类
 */
public class Director extends Leader {


    public Director(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveRequest request) {
        if(request.leaveDays < 3) {
            System.out.println(String.format("员工：%s请假，天数：%d，理由：%s", request.empName, request.leaveDays, request.reason));
            System.out.println(String.format("主任：%s，审批通过", name));
        } else {
            if(nextLeader != null) {
                nextLeader.handRequest(request);
            }
        }
    }
}
