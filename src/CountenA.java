public class CountenA extends Thread {
    public static void main(String[] args) {
        CountenA ct = new CountenA();
        ct.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("mian:i = " + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run:i = " + i );
        }
    }
}
