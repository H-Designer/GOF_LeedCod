package gof.设计模式.结构型模式.adapter.objectadapter;

public class Voltage220V {
    public int output220v(){
        int src = 220;
        System.out.println("电压" + src + "V");
        return src;
    }
}
