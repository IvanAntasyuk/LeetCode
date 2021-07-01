package leetcode;

public class ShuffleString1528 {
    static public String restoreString(String s, int[] indices) {
        if (s==null){
            return "";
        }
        char[] charAtString = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            int position = indices[i];
            charAtString[position] = s.charAt(i);
        }
       String result = String.valueOf(charAtString);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(restoreString("aaiougrt", new int[]{4, 0, 2, 6, 7, 3, 1, 5}));
    }
}
