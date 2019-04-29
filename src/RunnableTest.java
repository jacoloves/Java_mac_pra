public class RunnableTest {
    public static void main(String[] args) {
//        AsterRun1 ar1 = new AsterRun1();
//        Thread th = new Thread(ar1);
//        AsterRun2 ar2 = new AsterRun2();
//        Thread th2 = new Thread(ar2);
//        th.start();
//        th2.start();
        new Thread(new AsterRun1()).start();
        new Thread(new AsterRun2()).start();
    }

    static class AsterRun1 implements Runnable {
        Thread th = new Thread();

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    th.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("***");
            }
        }
    }

    static class AsterRun2 implements Runnable {
        Thread th = new Thread();

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    th.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("====");
            }
        }
    }
}
