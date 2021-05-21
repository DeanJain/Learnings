package programs.problems;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            int count = hm.get(c)!=null ? hm.get(c)+1:1;
            hm.put(c, count);
        }
        for (int i = 0; i < s.length() ; i++) {
            if(hm.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
