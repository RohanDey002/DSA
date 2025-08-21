package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public static void main(String[] args) {
        TreeNode treeCopy = new TreeNode(5);
        treeCopy.left = new TreeNode(3);
        treeCopy.right = new TreeNode(7);

        treeCopy.left.left = new TreeNode(1);
        treeCopy.left.right = new TreeNode(4);

        treeCopy.right.left = new TreeNode(6);
        treeCopy.right.right = new TreeNode(10);



        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);

        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(4);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(10);

        System.out.println(isSameTree(treeCopy,root));

    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;

        return isSameTree(p.left,q.left) & isSameTree(p.right,q.right);
    }


}
