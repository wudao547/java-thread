package thread.JUC;

public class foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (desk.lock){
                if(desk.count==0){
                    break;
                }else{
                    if(desk.foodFlag==0){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        desk.count--;
                        System.out.println("正在消费"+"还剩"+desk.count+"次");
                        desk.lock.notifyAll();
                        desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
