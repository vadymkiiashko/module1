package module;

public class binaryTreeMaxDepth {


    public int maxDepth(TreeNode myTree){

        if (myTree== null ) {
            return 0;
        }

     int maxDepthLeft = maxDepth(myTree.left);
        int maxDepthRight = maxDepth(myTree.right);

        int maxDepth = Math.max(maxDepthLeft,maxDepthRight);

        return maxDepth;

    }



      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


}
