package Test1;

public class JoinMethodTest implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=1;i<=5; i++){
                System.out.println("Child Thread-0 "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
          //  System.out.println(e);
        }
    }
    public static void main(String []args) throws InterruptedException
    {
        JoinMethodTest childThread =new JoinMethodTest();
        Thread implementedThread = new Thread(childThread);
        implementedThread.start();
        implementedThread.join();
        for (int j=1; j<=3; j++){
            System.out.println("Main Thread "+j);
            Thread.sleep(1000);
        }
    }
}
