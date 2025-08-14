package Binary_Tree;

public class MaximumPathSum {
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
        int[] result = {Integer.MIN_VALUE};

        solve(root,result);
        return result[0];
    }
    static int solve(TreeNode root ,int[] result){
        if (root==null) return 0;
        int left = solve(root.left,result);
        int right = solve(root.right,result);
        if (left<0) left=0;
        if(right<0) right=0;
        result[0] = Math.max(result[0],left+right+root.val );
        return root.val+Math.max(left,right);
    }
}
