package Binary_Tree;

//Lowest common ancestor in binary tree
public class LCAinBT {
    static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        TreeNode result =lowestCommonAncestor(root,root.left.left,root.left.right);
        System.out.println(result.val);
    }
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null ;

        if(root==p || root==q) return root;

        TreeNode left =  lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null) return root;
        if(left!=null) return left;

         return right;

    }
}
