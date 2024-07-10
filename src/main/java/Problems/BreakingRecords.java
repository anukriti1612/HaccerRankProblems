package Problems;
import java.util.ArrayList;
import java.util.List;
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class BreakingRecords {

    public static void main(String[] args) {
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1); // Example scores per game
        List<Integer> result = breakingRecords(scores);
        System.out.println(result);
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        int highestRecordCount=0;
        int lowestRecordCount =0;
        int highestRecord=scores.get(0); //initialize the highest to first element
        int lowestRecord=scores.get(0); //initialize the lowest to first element
        List<Integer> resultList= new ArrayList<>();

        for (Integer score : scores) {

            if (score > highestRecord){
                highestRecord= score;
                highestRecordCount++;
            }else if(score < lowestRecord){
                lowestRecord=score;
                lowestRecordCount++;
            }
        }
        resultList.add(highestRecordCount);
        resultList.add(lowestRecordCount);


        return resultList ;
    }

}

