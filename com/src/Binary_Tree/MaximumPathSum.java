package Binary_Tree;

public class MaximumPathSum {
    static int maxSum;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);

        root.left.right=new TreeNode(4);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(10);
        root.right.right.right = new TreeNode(13);

        System.out.println(maxPathSum(root));
    }
    static int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        maxSum = Integer.MIN_VALUE;

        solve(root);
        return maxSum;
    }
    static int solve(TreeNode root ){
        if(root==null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        int combineSum = left+right+root.val;
        int rootwithRightOrLeft = Math.max(left,right)+ root.val;
        int onlyRoot = root.val;
        maxSum = Math.max(maxSum, Math.max(combineSum,Math.max(rootwithRightOrLeft,onlyRoot)));
        return Math.max(rootwithRightOrLeft,onlyRoot);
    }
}
