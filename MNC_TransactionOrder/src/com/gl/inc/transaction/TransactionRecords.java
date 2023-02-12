package com.gl.inc.transaction;


public class TransactionRecords {

	public static void main(String[] args) {
		
		/*  Given tree  
		        50
	            /\ 
	          30  60
	         /     \
	        10      55
	       
		 */
		Main tree = new Main();
	     tree.node = new Tree(50);
	     tree.node.left = new Tree(30);
	     tree.node.right = new Tree(60);
	     tree.node.left.left = new Tree(10);
	    tree.node.right.left= new Tree(55);
	    Main.BstToSkewed(tree);
	    System.out.println("The transaction order is");
	    Main.inOrder();
	}

}
