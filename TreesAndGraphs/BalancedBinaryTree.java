package TreesAndGraphs;

public class BalancedBinaryTree {
    public int height(TreeNode root) {
        if (root == null) return 0;
        int heightLeft = height(root.left);
        int heightRight = height(root.right);

        if (heightLeft == -1 || heightRight == -1) return -1;
        if (Math.abs(heightLeft - heightRight) > 1) return -1;
        
        return Math.max(heightLeft, heightRight) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return height(root) != -1;
    }
}
