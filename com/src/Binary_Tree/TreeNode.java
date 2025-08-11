package Binary_Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
        this.right=null;
        this.left=null;
    }

    public TreeNode(int val,TreeNode right,TreeNode left){
        this.val=val;
        this.right=right;
        this.left=left;
    }
}
