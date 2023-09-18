import org.w3c.dom.ls.LSOutput;

public class Multiple {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println("The number of non-negative multiples of 3 or 5 below 1000 is: " + count);
    }
}
