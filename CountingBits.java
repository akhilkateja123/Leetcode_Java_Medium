package com.leetcode.medium;

public class CountingBits {

	// Algorithm

	public int[] countBits(int num) {

		int[] result = new int[num + 1];

		int pow = 1;
		int p = 1;

		for (int i = 1; i <= num; i++) {
			if (i == pow) {
				result[i] = 1;
				pow <<= 1; // Power of 2, number of 1 bits=1
				p = 1;
			} else {
				result[i] = result[p] + 1;
				p++;
			}
		}

		return result;
	}

	// Brute Force
	public int[] countBits(int num) {
		int[] result = new int[num + 1];

		for (int i = 1; i <= num; i++) {
			result[i] = count(i);
		}
		return result;
	}

	private int count(int num) {

		int result = 0;

		while (num > 0) {
			if (num % 2 == 0)
				result++;

			num /= 2;
		}

		return result;
	}

}
