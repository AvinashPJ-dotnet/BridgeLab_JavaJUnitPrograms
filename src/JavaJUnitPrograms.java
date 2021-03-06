import java.util.Arrays;
import java.util.Scanner;

public class JavaJUnitPrograms {

    public void vendingMachine(int amount) {
        int[] notes = {1, 2, 5, 10, 50, 100, 500, 1000};
        int len = notes.length - 1;
        int[] note = new int[25];//make it array list
        int counter = 0;
        while (amount > 0 && len >= 0) {
            if (amount >= notes[len]) {
                note[counter++] = notes[len];
                amount -= notes[len];
                if (amount >= notes[len])
                    continue;
                len--;
            } else
                len--;
        }
        System.out.println(Arrays.toString(note));
    }

    public String dayOfWeek(int d, int m, int y) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return weekDays[d0];
    }

    public static String convertTemperature() {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Convert Fahrenheit to Celsius\n2.Convert Celsius to Fahrenheit");
        System.out.println("Enter Choice: ");
        int ch = in.nextInt();
        int input = 0;
        double temp = 0;
        switch (ch) {
            case 1:
                System.out.println("Enter temperature in Fahrenheit(>32): ");
                input = in.nextInt();
                temp = (input - 32) * (5.0 / 9.0);
                break;
            case 2:
                System.out.println("Enter temperature in Celsius: ");
                input = in.nextInt();
                temp = (input * (9.0 / 5.0)) + 32;
                break;
        }
        return String.format("%.2f", temp);
    }

    public static double calculateMonthlyPayment(double p, float r, int y) {
        int n = 12 * y;
        double rate = r / (12 * 100);
        double payment = (p * rate) / (1 - (Math.pow((1 + rate), -n)));
        return Math.round(payment);
    }

    public static double sqrt(Number c) {
        double elipson = 1e-15;
        double temp = c.doubleValue() / 2;
        for (double sqrRoot; ; temp = sqrRoot) {
            sqrRoot = temp - (temp * temp - c.doubleValue()) / (2 * temp);
            if (Math.abs(temp - sqrRoot) < elipson)
                return sqrRoot;
        }
    }

    public static String toBinary(int num) {
        StringBuilder binaryValue = new StringBuilder();
        while (num > 0) {
            short binary = (short) (num % 2);
            binaryValue.append(binary);
            num = num / 2;
        }
        return binaryValue.toString();
    }

    public static String computeBinaryDecomposition(String binaryValue) {
        int binaryRepresent = 1;
        StringBuilder intRepresentation = new StringBuilder();
        for (int i = 0; i < binaryValue.length(); i++) {
            int val = Integer.parseInt(String.valueOf(binaryValue.charAt(i)));
            if (val == 1) {
                binaryRepresent = multiplyByTwo(binaryRepresent);
                if (i == 0)
                    binaryRepresent = 1;
                intRepresentation.append(binaryRepresent).append(",");
            } else {
                binaryRepresent = multiplyByTwo(binaryRepresent);
                if (i == 0)
                    binaryRepresent = 1;
            }
        }
        return intRepresentation.toString();
    }

    public static int multiplyByTwo(int number) {
        return number * 2;
    }
}
