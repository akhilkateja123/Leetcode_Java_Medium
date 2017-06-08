package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};

public class CopyListWithRandomPointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null)
			return null;

		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

		RandomListNode curr = head;

		while (curr != null) {
			map.put(curr, new RandomListNode(curr.label));
			curr = curr.next;
		}

		for (RandomListNode node : map.keySet()) {
			RandomListNode currentNode = map.get(node);
			currentNode.next = map.get(node.next);
			currentNode.random = map.get(node.random);
		}

		return map.get(head);

	}

}
