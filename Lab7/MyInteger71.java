package Lab7;
public class MyInteger71 {
    private int value;

    public MyInteger71(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public static boolean isEven(int evenNum) {
        if (evenNum % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public static boolean isOdd(int oddNum) {
        if (oddNum % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= num; i++) {
                if ((num % i) == 0) {
                    return true;
                }
            }

        }
        return true;
    }

}
