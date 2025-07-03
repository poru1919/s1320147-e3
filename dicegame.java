# s1320147-e3
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("Rolling dice...");

        Random random = new Random();
        int die1 = random.nextInt(6) + 1; // 1から6までの乱数を生成
        int die2 = random.nextInt(6) + 1; // 1から6までの乱数を生成
        int total = die1 + die2;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);
    }
}
