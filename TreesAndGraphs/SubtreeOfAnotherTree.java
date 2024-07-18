package TreesAndGraphs;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null && subRoot != null) return false;

        if (same(root, subRoot)) return true;

        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
    }

    private boolean same(TreeNode first, TreeNode second) {
        if (first == null && second == null) return true;
        if (first ==  null || second == null) return false;
        if (first.val != second.val) return false;

        return same(first.right, second.right) && same(first.left, second.left);
    }
}
