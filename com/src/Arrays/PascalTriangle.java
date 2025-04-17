package Arrays;
//1
//11
//121       <---- Pascal Triangle
//1331
//14641

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> ans =pascalTriangle(n);
        for (List<Integer> it:ans){
            for (int ele:it){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }


    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        for (int row=1;row<=numRows;row++ ){
            ans.add(generateRow(row));

        }

        return ans;
    }

    public static List<Integer> generateRow(int row) {
        int ans=1;
        List<Integer>ansRow=new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col <row ; col++) {
            ans = ans*(row-col);
            ans = ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}
