package Arrays;


import java.util.ArrayList;
import java.util.Arrays;

// Find the target sum of sorted consecutive sequence
public class SumConsecutive {
    public static void main(String[] args) {
        int target = 33;
        long[] call = sumOfThree(target);
        System.out.println(Arrays.toString(call));
    }

    public static long[] sumOfThree(int num){

        if(num%3!=0){
            return new long[]{};
        }else {
            int val = (num/3);
           return new long[] {val-1,val,val+1};

        }

    }

}


