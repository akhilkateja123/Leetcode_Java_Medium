package com.leetcode.easy;

import java.util.StringTokenizer;

public class ReverseWordsInString {

	public static void main(String[] args) {
		ReverseWordsInString obj = new ReverseWordsInString();
		System.out.println(obj.reverseWords("a"));
	}

	public String reverseWords(String s) {
		char[] charArr = s.toCharArray();
		StringBuilder builder = new StringBuilder();
		int end = -1;

		for (int j = charArr.length - 1; j >= 0; j--) {

			if (charArr[j] == ' ') {
				if (end > -1) {
					builder.append(s.substring(j + 1, end + 1) + " ");
				}
				end = -1;

			} else if (end == -1) {
				end = j;
			}
		}
		
		if(end>-1){
			builder.append(s.substring(0, end + 1) + " ");
		}
		
		return builder.toString().trim();
	}

}
