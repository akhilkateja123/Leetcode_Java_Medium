package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class TinyURL {

	Map<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {

	}

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		map.put(longUrl.hashCode(), longUrl);
		return "http://tinyurl.com/" + longUrl.hashCode();

	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
	}

}
