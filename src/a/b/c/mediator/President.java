package a.b.c.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理（中介者）实现类
 */
public class President implements IMediator {

    private Map<String, IDepartment> map = new HashMap<>();

    @Override
    public void register(String dname, IDepartment d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        System.out.println("总经理（中介者）开始协调工作");
        map.get(dname).selfAction();
    }
}
