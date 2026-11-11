package thread.JUC;

public class cook extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (desk.lock){
                if(desk.count == 0){
                    break;
                }else{
                    if(desk.foodFlag == 1){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        System.out.println("生产数据");
                        desk.foodFlag = 1;
                        desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
