package Binary_Tree;

import java.util.ArrayList;

//All possible paths from root leaf
public class PathNodes {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        ArrayList<ArrayList<Integer>> ans = paths(root);
        for (ArrayList<Integer> tem : ans){
            System.out.print("[ ");
            for (Integer i : tem){
                System.out.print(i+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    static ArrayList<ArrayList<Integer>> paths(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        if (root==null) return result;
        findPaths(root,result,temp);
        return result;
    }

    static  void findPaths(TreeNode root, ArrayList<ArrayList<Integer>> result,
                           ArrayList<Integer> temp){
        if(root==null) return;
        temp.add(root.val);
        if(root.left== null && root.right==null){
            result.add(new ArrayList<>(temp));

        }
        findPaths(root.left,result,temp);
        findPaths(root.right,result,temp);

        temp.remove(temp.size()-1);
    }
}
