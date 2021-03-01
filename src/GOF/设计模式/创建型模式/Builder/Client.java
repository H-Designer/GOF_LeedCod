package GOF.设计模式.创建型模式.Builder;

public class Client {
    public static void main(String args[]){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
