package com.gl.inc.transaction;

public class Main {
	
	public Tree node;
    public static Tree prevNode = null;
    public static Tree headNode = null;
   
    // binary search tree into a skewed tree in increasing order
    public static void BstToSkewed(Main tree)
    {
    	BstToSkewed(tree.node);
    }
    static void BstToSkewed(Tree root)
    {
       
        // Base Case
        if(root == null)
        {
            return;
        }
        
        BstToSkewed(root.left);
       
        Tree rightNode = root.right;
       
        
        
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
       
        
        BstToSkewed(rightNode);
       
    }
    public static void inOrder()
    {
    	inOrder(headNode);
    }
    
    //traversal of skewed tree
    
    static void inOrder(Tree root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ->");
        inOrder(root.right);       
    }

}
