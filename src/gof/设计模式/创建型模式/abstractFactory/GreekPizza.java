package gof.设计模式.创建型模式.abstractFactory;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("GizzkPizza");
        System.out.println(name + "preparing");
    }
}
