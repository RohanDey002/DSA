package Arrays;

import java.util.ArrayList;

public class removeDuplicate {
    public static void main(String[] args) {
        int [] arr={1,1,2};
        System.out.println(remove(arr) );
    }
    static int remove(int [] nums){
        int i=0;
        for (int j=1;j< nums.length;j++){
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
          return i+1;
    }
}
