package Binary_Tree;

public class BalanceBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);

        root.left.right=new TreeNode(4);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(10);
        root.right.right.right = new TreeNode(13);

        System.out.println(isBalanced(root));
    }
    static  boolean isBalanced(TreeNode root) {
         if(height(root)!=-1) return true;
         return false;
    }

    static int height(TreeNode root){
        if (root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        if (left==-1 || right==-1) return -1;

        if (Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }
}
