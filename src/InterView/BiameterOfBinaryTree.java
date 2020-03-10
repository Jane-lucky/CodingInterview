package InterView;

/*
给定一棵二叉树，你需要计算它的直径长度。
一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 */
public class BiameterOfBinaryTree {
    int ans;
    public int biameterOfBinarytree(TreeNode node){
        /*
        深度优先遍历
         */
        ans = 1;
        high(node);
        return ans -1;

    }
    public int high(TreeNode node) {
        if (node == null){
            return 0;
        }
        int L = high(node.left);
        int R = high(node.right);
        ans=Math.max(ans,L+R+1);
        return Math.max(L,R)+1;//查找数的最大值

    }


}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
