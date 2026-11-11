package thread.case2;

public class Demo1 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("窗口一");
        mt2.setName("窗口二");
        mt3.setName("窗口三");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
