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


}
