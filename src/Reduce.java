
public class Reduce {
    public static void main(String[] args) {
        // test
        int i = 100;
        int count = 0;

        while (i != 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i -= 1;
            }
            count++;
        }

        System.out.println("It took " + count + " steps to reach 0 starting from 100.");
    }
}
