package leetcode;

public class ImplementStrStr28 {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static int strStr2(String haystack, String needle){
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr2("hello", "ll"));
    }
}
