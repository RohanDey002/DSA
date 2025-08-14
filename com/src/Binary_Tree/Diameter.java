package Binary_Tree;

public class Diameter {
    static int result;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);

        root.left.right=new TreeNode(4);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(10);
        root.right.right.right = new TreeNode(13);

        System.out.println(diameterOfBinaryTree(root));
    }

    static int diameterOfBinaryTree(TreeNode root) {
         if (root==null) return 0;

         result = Integer.MIN_VALUE;

         solve(root);

         return result;
    }


    static int solve(TreeNode root){
        if (root==null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        result = Math.max(result,left+right);
        return Math.max(left,right)+1;

    }
}
