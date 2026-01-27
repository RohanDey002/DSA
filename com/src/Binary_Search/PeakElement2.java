package Binary_Search;

public class PeakElement2 {
    static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 15},
                {21, 30, 14},
                {7,  16, 32}
        };

        int[] result = findPeakGrid(matrix);
        for (int val: result){
            System.out.print(val+" ");
        }
    }
    static int[] findPeakGrid(int[][] mat) {
        int low = 0, high = mat[0].length-1;

        while (low<=high){
            int mid = low+(high-low)/2;
            int row  =  findRow(mat,mid);

            int left = mid-1>=0 ? mat[row][mid-1] : Integer.MIN_VALUE;
            int right  = mid+1<mat[0].length ? mat[row][mid+1] : Integer.MIN_VALUE;

            if(left<mat[row][mid] && right<mat[row][mid]){
                return new int[]{row,mid};
            } else if (left>mat[row][mid]) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        return new int[]{-1,-1};
    }

    static int findRow(int[][] mat , int col){
        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][col]>maxValue){
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}
