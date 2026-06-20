package Binary_Tree;

public class SymentricTree {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left = new TreeNode(4);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);

        System.out.println(isSymentric(root));
    }
    static boolean isSymentric(TreeNode root){
        if(root==null) return true;
        return  check(root.left,root.right);
    }
    static boolean check(TreeNode left , TreeNode right){

        if(left==null && right== null) return true;

        if(left==null || right==null) return false;


        return (left.val== right.val)&& check(left.left,right.right) && check(left.right,right.left);
    }
}
