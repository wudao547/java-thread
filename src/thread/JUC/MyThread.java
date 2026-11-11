package thread.JUC;

public class MyThread {
    public static void main(String[] args) {
        cook c = new cook();
        foodie f = new foodie();

        c.setName("生产者");
        f.setName("消费者");

        c.start();
        f.start();

    }
}
