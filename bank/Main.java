package syn;

/**
 * Created by zzc on 2018/4/11.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer c1 = new Customer(bank, "add", 100);
        Customer c2 = new Customer(bank, "add", 100);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
