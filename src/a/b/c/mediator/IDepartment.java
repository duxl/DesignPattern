package a.b.c.mediator;

/**
 * 同事（部门）接口
 */
public interface IDepartment {

    /**
     * 做本部门的事情
     */
    void selfAction();

    /**
     * 向总经理（中介者）发出请求
     */
    void outAction();
}
