package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);

        root.left.right=new TreeNode(4);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(10);
        root.right.right.right = new TreeNode(13);
        List<List<Integer>> answer = zigzagLevelOrder(root);
        for (List<Integer> it:answer){
            System.out.println(it);
        }
    }

    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root==null) return result;

        boolean leftToright = true;

        queue.offer(root);

        while (!queue.isEmpty()){

            List<Integer> ans = new ArrayList<>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                ans.add(0);
            }

            for (int i = 0; i < size; i++) {
             int index =i;
             if (leftToright!=true){
                 index= size-1-i;
             }

             if (queue.peek().left!=null) queue.offer(queue.peek().left);
             if(queue.peek().right!=null) queue.offer(queue.peek().right);
             ans.set(index,queue.poll().val);



            }
            leftToright = !leftToright;

            result.add(ans);
        }
        return result;

    }

}
