package GOF.设计模式.结构型模式.Bridge;

abstract class Abstraction {
    protected Implementor implementor;
    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public abstract void Operation();
}
