public class Man implements Runnable{
     public int i=10;


    public void run() {
        for (int j = 0; j <10 ; j++) {
            System.out.println(j);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
