package uz.pdp.Easy.p100;

public class Main {
    public static void main(String[] args) {
        TreeNode pTree = new TreeNode(5, new TreeNode(4), new TreeNode(6));
        TreeNode qTree = new TreeNode(5, new TreeNode(4), new TreeNode(6));

        System.out.println(isSameTree(pTree,qTree));



    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null){
            return true;
        }

        if (p == null || q == null){
            return false;
        }

        if (p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
