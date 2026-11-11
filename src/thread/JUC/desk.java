package thread.JUC;

public class desk {

    /*
       控制生产者和消费者的执行
              */

    /*  判断是否有生产数据   [ 0/1 ] */
    public static int foodFlag = 0;

    /*  记录总个数  */
    public static int count = 10;

    /*  锁对象  */
    public static Object lock = new Object();
}
