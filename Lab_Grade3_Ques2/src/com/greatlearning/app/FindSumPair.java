package com.greatlearning.app;

import java.util.*;

class FindSumPair{
	static class Node {
		int nodeData;
		Node leftNode, rightNode;	
	};
	static Node NewNode(int NodeData)
	{
		Node temp = new Node();
		temp.nodeData = NodeData;
		temp.leftNode = null;
		temp.rightNode = null;
		
		return temp;
		
	}
	public Node insert(Node root, int key) 
	{
		if (root == null)
			return NewNode(key);
		if (key < root.nodeData)
			root.leftNode = insert(root.leftNode, key);
		else 
			root.rightNode = insert(root.rightNode, key);
		return root;
		
	}
	public boolean findpairUtil(Node root, int sum, HashSet<Integer> set)
	{
		if (root == null )
			return false;
		
		if (findpairUtil(root.leftNode, sum, set))
			return true;
		if (set.contains(sum - root.nodeData))
		{
			System.out.println("Pair is found (" + (sum - root.nodeData) + "," + root.nodeData + ")");
			return true;
			
		}
		else set.add(root.nodeData);
		return findpairUtil(root.rightNode, sum, set);
		
	}
	public void findPairWithGivenSum(Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpairUtil(root, sum, set))
			System.out.println("Nodes are not found");
		
	}
	public static void main (String[] args) // Main function
	{
		Node root = null;
		FindSumPair find = new FindSumPair();
		root = find.insert(root,40);
		root = find.insert(root,20);
		root = find.insert(root,60);
		root = find.insert(root,10);
		root = find.insert(root,30);
		root = find.insert(root,50);
		root = find.insert(root,70);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		find.findPairWithGivenSum(root, sum);
		sc.close();
	}
}