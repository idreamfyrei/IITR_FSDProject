package com.gl.inc.transaction;

public class Main {
	
	public Tree node;
    public static Tree prevNode = null;
    public static Tree headNode = null;
   
    // binary search tree into a skewed tree in increasing order
    static void BstToSkewed(Tree root)
    {
       
        // Base Case
        if(root == null)
        {
            return;
        }
        
        BstToSkewed(root.left);
       
        Tree rightNode = root.right;
        Tree leftNode = root.left;
        
        // Condition to check if the root Node
        // of the skewed tree is not defined
        if(headNode == null)
        {
            headNode = root;
            root.left  = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
        // Similarly recurse for the left / right
        // subtree on the basis of the order required
        
        
        BstToSkewed(rightNode);
       
    }
    
    static void IncOrderTransaction(Tree root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        IncOrderTransaction(root.right);       
    }

}
