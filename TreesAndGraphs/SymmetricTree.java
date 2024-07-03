package TreesAndGraphs;

public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if ((root.right == null) && (root.left == null)) {
            return true;
        }
        return isMirror(root.right, root.left);
    }

    public boolean isMirror(TreeNode L, TreeNode R) {
        if ((L == null) && (R == null)) {
            return true;
        }
        if ((L == null) || (R == null)) {
            return false;
        }
        return L.val == R.val && isMirror(L.left, R.right) && isMirror(L.right, R.left);
    }
}

