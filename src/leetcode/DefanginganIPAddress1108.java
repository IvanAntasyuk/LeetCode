package leetcode;

public class DefanginganIPAddress1108 {
   static public String defangIPaddr(String address) {
    String newAddress =  address.replace(".","[.]");
       return newAddress;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.2.3.4"));
    }
}
