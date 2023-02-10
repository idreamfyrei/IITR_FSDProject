package com.gl.records.transaction;

public class Main { 
	Node node; 
	static Node root; 

	public static void main(String[] args) 
	{ 
		Main tree = new Main(); 
		tree.node = new Node(50); 
		tree.node.left = new Node(30); 
		tree.node.right = new Node(60); 
		tree.node.left.left = new Node(10); 
		tree.node.right.left = new Node(55); 
		
		Main.Skew(tree.node); 
		
		System.out.println("The transactions in icreasing order is");
		
		Main.inOrder(tree.node);
		
	}

	private static void inOrder(Node node2) {
		// TODO Auto-generated method stub
		
	}

	private static void Skew(Node node2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
