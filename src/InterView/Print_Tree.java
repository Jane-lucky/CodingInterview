package InterView;

import java.util.ArrayList;
import java.util.Stack;

/*
请实现一个函数按照之字形打印二叉树，
即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Print_Tree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        //用于存放打印的数组
        ArrayList<ArrayList<Integer>> a1 = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return a1;
        }

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        boolean flag = true;//用于表示行数
        stack1.push(pRoot.val);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            if (flag==true){

            }
//                while (!stack1.isEmpty()) {
//                    TreeNode p = new TreeNode();
//                    p.val = stack1.pop();
//                    if (p.left != null) {
//                        stack2.push(p.left.val);
//                    }
//                    if (p.right != null) {
//                        stack2.push(p.right.val);
//                    }
//                }
        }
        return a1;
    }

}
