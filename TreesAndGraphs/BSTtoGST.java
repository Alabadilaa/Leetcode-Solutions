package TreesAndGraphs;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 
class BSTtoGST {
    
    public void inOT(TreeNode node, ArrayList<Integer> sorted) {
        if (node == null) {
            return;
        }
        inOT(node.left, sorted);
        sorted.add(node.val);
        inOT(node.right, sorted);
    }
    
    public void fill(TreeNode root, int[] psum) {
        int[] index = {0};
        reassign(root, psum, index);
    }

    private void reassign(TreeNode node, int[] psum, int[] index) {
        if (node == null) {
            return;
        }
        reassign(node.left, psum, index);
        node.val = psum[index[0]];
        index[0]++;
        reassign(node.right, psum, index);
    }
    
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<Integer> sorted = new ArrayList<>();
        inOT(root, sorted);

        int[] psum = new int[sorted.size()];
        int sum = 0;

        for (int i = sorted.size() - 1; i >= 0; i--) {
            sum += sorted.get(i);
            psum[i] = sum;
        }

        fill(root, psum);

        return root;
    }
}