package GOF.设计模式.创建型模式.Builder;

public class ConcreteBuilder extends Builder {

    public void buildPartA() {
        product.setPartA("建造A");
    }


    public void buildPartB() {
        product.setPartA("建造B");
    }


    public void buildPartC() {
        product.setPartA("建造C");
    }
}
