package Hashing;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,4,3,2};
        System.out.println(missingNumber(arr));
    }


         static int missingNumber(int[] nums) {
            int end=nums.length;
            int hash[]=new int[end+1];

            for(int i=0;i<end;i++){
                hash[nums[i]]=nums[i];
            }
            for(int j=1;j<hash.length;j++){
                if(j!=hash[j]){
                    return j;
                }
            }
            return end-end;
        }

}
