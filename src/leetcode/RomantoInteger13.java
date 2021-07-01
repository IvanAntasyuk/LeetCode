package leetcode;

import java.util.HashMap;

public class RomantoInteger13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') count -= 2;
            }
            if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') count -= 20;
            }
            if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C') count -= 200;
            }
            count += map.get(s.charAt(i));
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XLC"));
    }
}
