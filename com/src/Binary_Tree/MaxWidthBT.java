package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBT {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        root.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(widthOfBinaryTree(root));
    }

    static int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> que = new LinkedList<>();
        int maxWidth =0;
        que.offer(new Pair(root,0));

        while (!que.isEmpty()){
            int first = que.peek().value;
            int last =((LinkedList<Pair>) que).getLast().value;
            maxWidth = Math.max(maxWidth,last-first+1);

            int size = que.size();
            for (int i = 0; i < size; i++) {
                Pair temp = que.poll();
                TreeNode curNode = temp.node;
                int idx = temp.value;
                 if(curNode.left!=null){
                     que.offer(new Pair(curNode.left,2*idx+1));
                 }
                 if (curNode.right!=null){
                     que.offer(new Pair(curNode.right,2*idx+2));
                 }

            }
        }
        return maxWidth;
    }

    static class Pair{
        TreeNode node;
        int value;
        public Pair(TreeNode node, int value){
            this.node = node;
            this.value = value;
        }
    }

}
