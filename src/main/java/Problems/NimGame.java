package Problems;
import java.sql.SQLOutput;
import java.util.List;
//https://www.hackerrank.com/challenges/nim-game-1/problem
public class NimGame {

    public static void main(String[] args) {
        List<Integer> pile = List.of(3, 4, 7); // Example pile configuration
        String result = nimGame(pile);
        System.out.println(result); // Output: "First" or "Second"
    }

    public static String nimGame(List<Integer> pile) {
        int nimSum = 0;
        for (int stones : pile) {
            nimSum ^= stones;   //using Xor operator.
            System.out.println(nimSum);
        }

        if (nimSum == 0) {
            return "Second";
        } else {
            return "First";
        }
    }
}
