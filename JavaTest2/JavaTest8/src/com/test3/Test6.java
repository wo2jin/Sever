package com.test3;

import java.util.StringTokenizer;

public class Test6 {

	public static void main(String[] args) {
		String str = "��:1:zoo:4:��";
		StringTokenizer st = new StringTokenizer(str,":");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
