package com.leetcode.easy;

public class DivideIntegers {

	public int divide(int dividend, int divisor) {
		boolean negative = false;
		
		long tmpDividend = dividend;
		long tmpDivisor = divisor;

		long result = divideLong(Math.abs(tmpDividend), Math.abs(tmpDivisor));

		if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
			result=-result;
		}
		
		
		return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? Integer.MAX_VALUE: (int) result;
	}

	private long divideLong(long dividend, long divisor) {
		long sum = divisor;
		long count = 1;

		if (dividend < divisor)
			return 0;

		while ((sum + sum) <= dividend) {
			sum += sum;
			count += count;
		}

		return count + divideLong(dividend - sum, divisor);
	}

	public static void main(String... args) {
		DivideIntegers obj = new DivideIntegers();
		System.out.println(obj.divide(-2147483648, 1));
	}

}
