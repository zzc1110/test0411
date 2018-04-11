package syn;

/**
 * Created by zzc on 2018/4/11.
 */
public class Customer implements Runnable {
    private Bank bank;
    private String type;
    private int money;

    public Customer(Bank bank, String type, int money) {
        this.bank = bank;
        this.type = type;
        this.money = money;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            if (type == "add") {
                bank.add(money);
            } else {
                bank.reduce(money);
            }
        }
    }
}
