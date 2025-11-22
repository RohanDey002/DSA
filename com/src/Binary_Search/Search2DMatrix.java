package Binary_Search;

public class Search2DMatrix {
    static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,11));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
         int low =0 , high = (matrix.length * matrix[0].length)-1;

         while (low<=high){
             int mid = low+(high-low)/2;
             int row = mid/matrix[0].length;
             int coulum = mid%matrix[0].length;
             if(matrix[row][coulum]==target) return true;
             else if (matrix[row][coulum]> target) {
                 high = mid-1;
             }else {
                 low = mid+1;
             }
         }

        return  false;
    }
}
