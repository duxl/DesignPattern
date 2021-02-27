package a.b.c.mediator;

/**
 * 中介者接口
 */
public interface IMediator {

    /**
     * 注册部门
     *
     * @param dname 部门名称
     * @param d     部门对象
     */
    void register(String dname, IDepartment d);

    /**
     * 执行命令
     *
     * @param dname 部门名称
     */
    void command(String dname);
}
