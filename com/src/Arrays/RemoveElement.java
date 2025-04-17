package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] arr={0,1,2,2,3,0,4,2};
        System.out.println(remove(arr,2) );
    }
    static int remove(int [] nums,int val){
        int i=0;
        for (int j=0;j< nums.length;j++){
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
