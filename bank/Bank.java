package syn;

/**
 * Created by zzc on 2018/4/11.
 */
public class Bank {
    public int sum = 10000;

    public synchronized void add(int n) {
        sum += n;

        try {
            Thread.sleep(0);
        } catch (Exception ignore) {
        }
        System.out.println(Thread.currentThread().getName() + "...sum=" + sum);
    }

    public synchronized void reduce(int n) {
        if (sum - n < 0) {
            System.out.println("====余额不足");
        } else {
            sum -= n;
        }

        try {
            Thread.sleep(0);
        } catch (Exception ignore) {
        }
        System.out.println(Thread.currentThread().getName() + "...sum=" + sum);
    }
}
