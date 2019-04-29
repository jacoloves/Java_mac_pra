public class ThreadTest {
    public static void main(String[] args) {
        new AsterTest().start();
        new AsterTest2().start();
    }

    private static class AsterTest extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {

                }
                System.out.println("***");
            }
        }
    }

    private static class AsterTest2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
                System.out.println("====");
            }
        }
    }
}
