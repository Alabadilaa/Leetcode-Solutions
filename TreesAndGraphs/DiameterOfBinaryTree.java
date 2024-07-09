package TreesAndGraphs;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    int diameter = 0;

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int heightLeft = height(root.left);
        int heightRight = height(root.right);
        int curr = heightLeft + heightRight + 1;
        diameter = Math.max(diameter, curr);

        return Math.max(heightLeft, heightRight) + 1;
    }
}
