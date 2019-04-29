public class RunnableMulti {
    public RunnableMulti(int jobcount) {
        for (int i = 0; i < jobcount; i++) {
            new Thread(new RunnableJob(i)).start();
        }
    }

    public static void main(String[] args) {
        new RunnableMulti(10);
    }
}

class RunnableJob extends Job implements Runnable {
    public RunnableJob(int n) {
        super(n);
    }
    @Override
    public void run() {
        while (true) {
            work();
        }
    }
}
