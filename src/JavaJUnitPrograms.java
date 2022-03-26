import java.util.Arrays;

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
                if(amount>=notes[len])
                    continue;
                len--;
            }else
                len--;
        }
        System.out.println(Arrays.toString(note));
    }

    public String dayOfWeek(int d,int m,int y){
        String[] weekDays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int y0 = y- (14 - m) / 12;
        int x = y0 + y0 /4 - y0 /100 + y0 /400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0) / 12) % 7;
        return weekDays[d0];
    }
}
