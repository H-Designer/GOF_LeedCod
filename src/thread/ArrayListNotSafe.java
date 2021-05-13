package thread;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNotSafe {
    public static void main(String[] args) throws InterruptedException {
        List<String> arrayList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                synchronized (arrayList){
                    arrayList.add("1");
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(arrayList.size());
    }
}
