package thread.case2;

public class MyThread extends Thread {
    static int t = 0;
    static Object o = new Object();
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o) {
                if (t < 10) {
                    t++;
                    System.out.println(getName() + "正在卖" + "第" + t + "张票");
                } else {
                    break;
                }
            }
        }
    }
}