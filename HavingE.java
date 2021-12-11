
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HavingE {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        
        //Java 7
        long result = solveJava7(input);

        //After Java 8
        long result2 = solveJava8(input);
        
        System.out.println(result);
        System.out.println(result2);
    }

    private static long solveJava7(String input) {
        char[] charList = input.toCharArray();
        long result = 0;
        for(char cur : charList) {
            if('e' == cur) result++;
        }
        return result;
    }

    private static long solveJava8(String input) {
        List<String> list = Arrays.asList(input.split(""));
        
        Stream<String> hasA = 
        list.stream().filter(word -> word.equals("e"));
        return hasA.count();
    }
}
