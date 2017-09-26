import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello.");

        int i = new Random().nextInt(10);
        if (i < 4)
            System.out.println("HI.");
        else
            System.out.println("BYE.");

    }

}
