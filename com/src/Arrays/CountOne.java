package Arrays;

import java.util.Arrays;

public class CountOne {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(count(arr));
    }
    static int count(int[] arr){
        int countVal=0;
        countVal = Arrays.stream(arr).sum();

        return countVal;
    }
}
