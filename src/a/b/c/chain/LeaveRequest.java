package a.b.c.chain;

/**
 * 封装请假的基本信息
 */
public class LeaveRequest {
    public String empName; // 员工名字
    public int leaveDays; // 天数
    public String reason; // 原因

    public LeaveRequest(String empName, int leaveDays, String reason) {
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }
}
