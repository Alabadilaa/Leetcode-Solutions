package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;

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

class BalanceBST {
    private void inOT(TreeNode node, List<Integer> sorted) {
        if (node == null) {
            return;
        }
        inOT(node.left, sorted);
        sorted.add(node.val);
        inOT(node.right, sorted);
    }

    private TreeNode fill(List<Integer> sorted, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(sorted.get(mid));

        node.left = fill(sorted, start, mid - 1);
        node.right = fill(sorted, mid + 1, end);

        return node;
    }
    
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sorted = new ArrayList<>();

        inOT(root, sorted);

        return fill(sorted, 0, sorted.size() - 1);

    }
}