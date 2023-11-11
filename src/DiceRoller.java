import java.util.Random;

public class DiceRoller {
    Random random = new Random();
    int num = 0;
    DiceRoller(){

        roll();

    }

    void roll(){
        num = random.nextInt(6)+1; // we add + 1 because random starts at 0
        System.out.println(num);
    }
}
