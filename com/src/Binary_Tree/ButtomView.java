package Binary_Tree;

import java.util.*;

public class ButtomView {
    static void main(String[] args) {
        TreeNode root = new TreeNode(20);

        root.left = new TreeNode(8);
        root.right = new TreeNode(22);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);

        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        root.left.right.left.left = new TreeNode(28);

        ArrayList<Integer> ans = bottomView(root);
        for(int a : ans) {
            System.out.println(a);
        }
    }

    static ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> que = new LinkedList<>();

        que.offer(new Pair(0, root));
        while (!que.isEmpty()) {
            Pair pair = que.poll();
            int value = pair.value;
            TreeNode node = pair.node;
            map.put(value, node.val);
            if (node.left != null) {
                que.offer(new Pair(value-1, node.left));
            }
            if (node.right != null) {
                que.offer(new Pair(value+1, node.right));
            }
        }
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           result.add(entry.getValue());
       }




        return result;
    }


    static class Pair{
        int value;
        TreeNode node;

        public Pair(int value, TreeNode node) {
            this.value = value;
            this.node = node;
        }
    }

}
