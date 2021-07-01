package leetcode;


import java.util.stream.IntStream;

public class ReverseInteger7 {
    public static int reverse(int x) {
//        String str = String.valueOf(x);
//        char[] in = str.toCharArray();
//        int begin=0;
//        int end=in.length-1;
//        char temp;
//        while(end>begin) {
//            temp = in[begin];
//            in[begin] = in[end];
//            in[end] = temp;
//            end--;
//            begin++;
//        }
//    return   Integer.valueOf(String.valueOf(in));
//            long reverse = 0;
//            while(x != 0){
//                reverse = reverse * 10 + x % 10;
//                x = x / 10;
//            }
//            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
//                return 0;
//
//            return (int)reverse;
        int reverseNum;
        StringBuilder s = new StringBuilder();
        s.append(x);
        if(s.charAt(0)=='-')
        {
            s.deleteCharAt(0);
            s.reverse();
            String s1 = s.toString();
            try{
                reverseNum = -(Integer.parseInt(s1));
            }
            catch(NumberFormatException e)
            {
                reverseNum=0;
            }
        }
        else
        {
            s.reverse();
            String s1 = s.toString();
            try{
                reverseNum = Integer.parseInt(s1);
            }
            catch(NumberFormatException e)
            {
                reverseNum=0;
            }
        }
        return reverseNum;
        }



    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
