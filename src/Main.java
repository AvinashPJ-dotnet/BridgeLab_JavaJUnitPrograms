import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JavaJUnitPrograms javaJUnitPrograms = new JavaJUnitPrograms();
        short ch = 0;
        System.out.printf("\n1. Vending Machine\n2. Day of week\n3. Temperature Conversion\n4. Monthly payment\n5. Square Root\n6. Binary Conversion\n0. Exit\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter choice: ");
        ch = in.nextShort();
        switch (ch) {
            case 1:
                javaJUnitPrograms.vendingMachine(999);
                break;
            case 2:
                String weekDay = javaJUnitPrograms.dayOfWeek(19, 3, 2022);
                System.out.println(weekDay);
                break;
            case 3:
                String temp = JavaJUnitPrograms.convertTemperature();
                System.out.println(temp);
                break;
            case 4:
                double payment = JavaJUnitPrograms.calculateMonthlyPayment(Double.parseDouble(args[0]), Float.parseFloat(args[1]), Integer.parseInt(args[2]));
                System.out.println(payment);
                break;
            case 5:
                JavaJUnitPrograms.sqrt(16);
                break;
            case 6:
                String binaryNumber=JavaJUnitPrograms.toBinary(63);
                System.out.print(javaJUnitPrograms.computeBinaryDecomposition(binaryNumber));
                break;
        }
    }
}
