package GOF.设计模式.结构型模式.Bridge;

public class ConcreteImplementorA implements Implementor {
    public void OperationImpl(){
        System.out.println("具体实例化被访问");
    }
}
