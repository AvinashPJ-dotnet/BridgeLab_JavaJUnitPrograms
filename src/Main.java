public class Main {
    public static void main(String[] args) {
        JavaJUnitPrograms javaJUnitPrograms = new JavaJUnitPrograms();
//        javaJUnitPrograms.vendingMachine(999);

//        String weekDay=javaJUnitPrograms.dayOfWeek(19,3,2022);
//        System.out.println(weekDay);

//        String temp=JavaJUnitPrograms.convertTemperature();
//        System.out.println(temp);

        double payment=JavaJUnitPrograms.calculateMonthlyPayment(Double.parseDouble(args[0]),Float.parseFloat(args[1]),Integer.parseInt(args[2]));
        System.out.println(payment);

    }
}
