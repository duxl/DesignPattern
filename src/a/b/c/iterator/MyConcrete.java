package a.b.c.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 */
public class MyConcrete {

    private List<Object> list = new ArrayList<>();

    public void addObject(Object obj) {
        list.add(obj);
    }

    public void removeObject(Object obj) {
        list.remove(obj);
    }

    public MyIterator getIterator() {
        return new ConcreteIterator();
    }

    // 使用内部类定义迭代器，可以直接使用外部类属性
    private class ConcreteIterator implements MyIterator {
        private int cursor; // 定义游标用于记录遍历时的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
