package Binary_Tree;

import org.w3c.dom.Node;

import java.util.*;

public class TopView {
    static void main(String[] args) {
        TreeNode root = new TreeNode(40);

        root.left = new TreeNode(20);
        root.right = new TreeNode(90);

        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(100);

        ArrayList<Integer> list = topView(root);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    static ArrayList<Integer> topView(TreeNode root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        queue.offer(new Pair(root,0));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            TreeNode node = pair.node;
            int value = pair.value;
            if(!map.containsKey(value)){
                map.put(value,node.val);
            }
            if (node.left != null) {
                queue.offer(new Pair(node.left,value-1));
            }
            if (node.right != null) {
                queue.offer(new Pair(node.right,value+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            result.add(entry.getValue());
        }


        return result;
    }

    static class Pair{
        TreeNode node;
        int value;
        public Pair(TreeNode node, int value) {
            this.node = node;
            this.value = value;
        }
    }
}

