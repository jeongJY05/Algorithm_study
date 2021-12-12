import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HaveSpace {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       sc.close();
       Map<Character, Integer> keyLocation = new HashMap<Character, Integer>();

        keyLocation.put('a', 1);
        keyLocation.put('s', 2);
        keyLocation.put('d', 3);
        keyLocation.put('f', 4);
        keyLocation.put('g', 5);
        keyLocation.put('h', 6);
        keyLocation.put('j', 7);
        keyLocation.put('k', 8);
        keyLocation.put('l', 9);

       int countTime = 0;

       char recentChar = 'a';
       for(char alph : input.toCharArray()) {
           if(alph != recentChar) {
                int x1 = keyLocation.get(alph);
                int x2 = keyLocation.get(recentChar);
                countTime += Math.abs(x1-x2);
                recentChar = alph;
           }
           countTime++;
       }
    System.out.println(countTime);
   } 
}
