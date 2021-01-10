package a.b.c.iterator;

public class Client {
    public static void main(String[] args) {
        MyConcrete mc = new MyConcrete();
        mc.addObject("a");
        mc.addObject("b");
        mc.addObject("c");

        MyIterator iterator = mc.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
