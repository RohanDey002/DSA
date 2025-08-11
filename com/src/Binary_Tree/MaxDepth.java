package Binary_Tree;

public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);

        root.left.right=new TreeNode(4);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(10);
        root.right.right.right = new TreeNode(13);

        System.out.println(maxDepth(root));
    }
    static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1+Math.max(left,right);
    }
}
