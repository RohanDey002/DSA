package Arrays;

import java.util.ArrayList;
import java.util.List;

//Find the elements that appears for n/3 times
public class MajorityElement3 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,3,3,2};
        List<Integer>ans =majorityElement(arr);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    public static List<Integer> majorityElement(int [] nums){
        int n = nums.length;
        int ctn1=0;
        int ctn2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2= Integer.MIN_VALUE;
        List<Integer>ls=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            if (ctn1==0 && ele2 !=nums[i]){
                ctn1=1;
                ele1=nums[i];
            } else if (ctn2==0 && ele1!=nums[i]) {
                ctn2=1;
                ele2=nums[i];
            } else if (ele1==nums[i]) {
                ctn1++;
            } else if (ele2==nums[i]) {
                ctn2++;
            }else {
                ctn1--;
                ctn2--;
            }

        }

        ctn1=0;ctn2=0;
        for (int i = 0; i <n ; i++) {
            if (ele1==nums[i])ctn1++;
            if (ele2==nums[i])ctn2++;
        }
        int mini=(int)(n/3)+1;
        if (ctn2>=mini)ls.add(ele2);
        if (ctn1>=mini)ls.add(ele1);

        return ls;
    }
}
