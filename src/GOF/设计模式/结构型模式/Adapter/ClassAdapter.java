package GOF.设计模式.结构型模式.Adapter;

public class ClassAdapter extends Adapter implements Target {
    public void request(){
        specificRequest();
    }
}
