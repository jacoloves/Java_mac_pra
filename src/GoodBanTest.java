public class GoodBanTest extends Thread {
    GoodBank bank;
    public GoodBanTest(GoodBank bank)
    {
        this.bank = bank;
    }
    @Override
    public void run() {
        while (true) {
            bank.addMoney(100);
            bank.addMoney(-100);
        }
    }

    public static void main(String[] args) {
        GoodBank bank = new GoodBank();
        new GoodBanTest(bank).start();
        new GoodBanTest(bank).start();
    }
}
