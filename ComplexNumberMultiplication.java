package com.leetcode.medium;

import java.util.StringTokenizer;

public class ComplexNumberMultiplication {

	public String complexNumberMultiply(String a, String b) {

		StringTokenizer tokenizerA = new StringTokenizer(a, "+");
		StringTokenizer tokenizerB = new StringTokenizer(b, "+");
		
		String complexTkn;
		
		int[] arrA = new int[] { Integer.parseInt(tokenizerA.nextToken()),
				Integer.parseInt(tokenizerA.nextToken().replace("i","")) };
		int[] arrB = new int[] { Integer.parseInt(tokenizerB.nextToken()),
				Integer.parseInt(tokenizerB.nextToken().replace("i","")) };

		int real = arrA[0] * arrB[0] + arrA[1] * arrB[1] * -1;
		int complex = arrA[1] * arrB[0] + arrA[0] * arrB[1];

		return real + "+" + complex + "i";

	}

}
