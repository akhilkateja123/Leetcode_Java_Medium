package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> listOfNodes = new ArrayList<List<Integer>>();

		if (root == null)
			return listOfNodes;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int levelNumber = queue.size();

			List<Integer> subList = new ArrayList<Integer>();

			for (int i = 0; i < levelNumber; i++) {
				if (queue.peek().left != null) {
					queue.add(queue.peek().left);
				}

				if (queue.peek().right != null) {
					queue.add(queue.peek().right);
				}

				subList.add(queue.poll().val);
			}

			listOfNodes.add(subList);
			
		}

		return listOfNodes;
	}

	public static void main(String... args) {
		BinaryTreeLevelOrderTraversal obj = new BinaryTreeLevelOrderTraversal();
		TreeNode root = new TreeNode(0);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left = five;
		two.right = six;
		obj.levelOrder(root);
	}
}
