package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        List<Integer> ans  = rightSideViewDFS(root);
        for (int i : ans){
            System.out.println(i);
        }


    }

    //Using BFS
    static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null) return result;

        que.offer(root);
        while (!que.isEmpty()){
            int size = que.size();
            TreeNode node = null;
            for (int i = 0; i < size; i++) {
                 node = que.poll();
                if(node.left!=null){
                    que.offer(node.left);
                }
                if (node.right!=null){
                    que.offer(node.right);
                }
            }
            result.add(node.val);
        }


        return result;
    }

    //Uisng DFS

    static List<Integer> rightSideViewDFS(TreeNode root){

        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        preOrder(root,1, result);
        return result;
    }
    static void preOrder(TreeNode root, int level , List<Integer> result){
        if(root==null) return;

        if(result.size()<level){
            result.add(root.val);
        }
        preOrder(root.right,level+1,result);
        preOrder(root.left,level+1,result);
    }
}
