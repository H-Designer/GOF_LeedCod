package GOF.设计模式.结构型模式.Bridge;

public class RefinedAbstarction extends Abstraction {
    protected RefinedAbstarction(Implementor implementor){
        super(implementor);
    }
    public void Operation(){
        System.out.println("抽象化被访问");
        implementor.OperationImpl();
    }
}
