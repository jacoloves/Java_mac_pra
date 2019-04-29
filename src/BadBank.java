public class BadBank {
    private int value = 0;

    public void addMoney(int money) {
        int currentValue = value;

        System.out.println(Thread.currentThread() + "がaddMoneyに入りました");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました");
            System.exit(-1);
        }

        System.out.println(Thread.currentThread() + "がaddMoneyから出ました。");
    }
}
