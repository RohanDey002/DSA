package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(10);
        List<List<Integer>> answer = breathFirst(root);
        for (List<Integer> it:answer){
            System.out.println(it);
        }
    }

    static List<List<Integer>> breathFirst(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root== null) return  result;
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize= queue.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i <levelSize ; i++) {
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            result.add(sublist);

        }

        return result;
    }
}
