package TreesAndGraphs;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode temp = root.right;
        TreeNode tempo = root.left;

        root.left = invertTree(temp);
        root.right = invertTree(tempo);

        return root;
    }
}
