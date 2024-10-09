package com.string;

public class MutableImmutable {
	public static void main(String[] args) {
		String s1 = new String("sita");
		String s2 = new String("ram");
		s1.concat(s2);
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		StringBuffer sb1 = StringBuffer("radha");
		StringBuffer sb2 = StringBuffer("krishna");
		
	}

	private static StringBuffer StringBuffer(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
