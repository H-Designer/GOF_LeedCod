package GOF.设计模式.创建型模式.protoType.extend;

public interface Shape extends Cloneable{
    Object clone();
    void countArea();
}
