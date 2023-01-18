package com.gitproject;

import java.util.HashSet;
import java.util.Set;

public class ArrayList {
	public static void main(String[] args) {
		String str="Hello i love java";
		char[]ch=str.toCharArray();
		Set<Character>s=new HashSet<Character>();
		Set<Character>duplicate=new HashSet<Character>();
		for(char c:ch) {
			if(!s.add(c)&& c!=' ') {
				duplicate.add(c);
			}
		}
		System.out.println(duplicate);
	}

}
