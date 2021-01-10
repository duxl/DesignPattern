package a.b.c.chain;

/**
 * 总经理类
 */
public class GeneralManager extends Leader {


    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveRequest request) {
        if(request.leaveDays < 30) {
            System.out.println(String.format("员工：%s请假，天数：%d，理由：%s", request.empName, request.leaveDays, request.reason));
            System.out.println(String.format("总经理：%s，审批通过", name));
        } else {
            System.out.println(String.format("莫非%s想辞职，居然请假%d天", request.empName, request.leaveDays));
        }
    }
}
