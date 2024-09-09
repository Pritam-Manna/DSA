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
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap <Integer, TreeNode> allNodes = new HashMap <Integer, TreeNode> ();
        HashSet <Integer> head = new HashSet<Integer>();
        HashSet <Integer> notHead = new HashSet<Integer>();

        for (int[] curNode : descriptions){

            //check if head
            if(!notHead.contains(curNode[0])){
                head.add(curNode[0]);
            }
            if(head.contains(curNode[1])){
                head.remove(curNode[1]);
            }
            notHead.add(curNode[1]);

            //check if node already created [child node]
            TreeNode newNodeChild = new TreeNode();
            if(!allNodes.containsKey(curNode[1])){
                newNodeChild.val = curNode[1];
                newNodeChild.left = null;
                newNodeChild.right = null;
                allNodes.put(curNode[1], newNodeChild);
            }else{
                newNodeChild = allNodes.get(curNode[1]);
            }


            //check if node already created [parent node]
            TreeNode newNodedParent = new TreeNode();
            if(!allNodes.containsKey(curNode[0])){
                newNodedParent.val = curNode[0];
                newNodedParent.left = null;
                newNodedParent.right = null;
                allNodes.put(curNode[0], newNodedParent);
            }else{
                newNodedParent = allNodes.get(curNode[0]);
            }

            if(curNode[2] == 1){
                newNodedParent.left = newNodeChild;
            }else{
                newNodedParent.right = newNodeChild;
            }
        }
        return allNodes.get(head.stream().findFirst().get());
    }
}
