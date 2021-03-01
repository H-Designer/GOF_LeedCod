package GOF.设计模式.结构型模式.Adapter;

public class main {
    public static void main(String args[]){
        System.out.println("类适配器模式测试：");
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.request();
    }
}
