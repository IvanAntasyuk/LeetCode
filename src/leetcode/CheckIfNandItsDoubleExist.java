package leetcode;

public class CheckIfNandItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {

        for(int i=0; i<arr.length; i++){

            if(arr[i]%2==0){

                for(int j=0; j<arr.length; j++){
                    if(i==j){
                        continue;
                    }
                    if(arr[j]*2==arr[i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10, 2, 5, 3}));
        System.out.println(checkIfExist(new int[]{7,1,14,11}));
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }
}
