package com.androidcourse.lecture4;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.androidcourse.lecture4.lectures.AndroidLecture;
import com.androidcourse.lecture4.lectures.Lecture;
import com.androidcourse.lecture4.lectures.LectureInterface;

public class Main {
	
	// private
	// protected
	// public
	
	public static final int SOME_NUMBER = 0;

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		if(a && b) { // Logical AND
			
		}
		
		if(a || b) { // Logical OR
			
		}
		
		if(a ^ b) { // Logical XOR
			
		}
		
		if(!a) { // NOT a
			
		}
		
		byte c = 5; // -128..127
		short d = 1; // -2^15..2^15
		char e = 3; // 0..2^16-1=~65500
		int f = 4; // -2^31..2^31
		long g = 6; // -2^63..2^63
		
		float h = 1.0f; // 1.5^-45..3.4^-38
		double i = 1.0; // 5^-324..1.7^308
		
		/*
		 * Operations
		 * - Logical
		 * ==
		 * !=
		 * >
		 * >=
		 * <
		 * <=
		 * Mathematical
		 * +
		 * -
		 * *
		 * //
		 * % (mod)
		 * =
		 * ++
		 * --
		 * +=
		 * -=
		 * *=
		 * //=
		 * %=
		 */
		
		// Object
		
		String text = "Hello";
		String text2 = new String("Hello");
		Object text3 = new String("Hello");
		String text4 = text2;
		
		if(text3 instanceof String) {
			
		}
		
		if(text2 == text3) { // return false
			
		}
		
		if(text2 == text4) { // return true
			
		}
		
		if(text == text2) { // return false
			
		}
		
		if(text2.equals(text3)) { // true
			
		}
		
		// class wrappers
		//byte  //Byte
		//short //Short
		//char  //Character
		//int   //Integer
		//long  //Long
		//float //Float
		//double //Double
		
		Long m = (long)5;
		Long n = null;
		try {
			n = Long.parseLong("5sdfsdjkf");
		} catch(NumberFormatException ex) {
			System.out.print(ex.getMessage());
			n = (long)5;
		} finally {
			System.out.print("n is set");
		}
		
		if(m == n) { // return false
			
		}
		
		if(m.equals(n)) { // return true
			
		}
		
		// equals(Object obj)
		// hashCode();
		// toString();
		
		Lecture lecture = new Lecture("Lecture 4");
		String lectureString = lecture.toString();
		
		
		Lecture lecture4 = new AndroidLecture();
		//lecture4.start();
		
		
		LectureInterface lec4 = new AndroidLecture();
		//lec4.start();
		
		
		AndroidLecture lect4 = new AndroidLecture();
		lect4.start();

		// ArrayList
		List<String> stringList = new LinkedList<String>();
		stringList.add("Some string");
		stringList.add("Other string");
		stringList.add("One more string");
		
		String str = stringList.get(2); // returns "One more string"
		
		for(int x = 0; x < stringList.size(); x++) {
			//
		}
		
		for(String strObj : stringList) {
			// 
		}
		
		Set<String> set = new HashSet<String>();
		set.add("some string");
		
		// Map<E>
		// Stack
		// Queue
		
		
	}

	
}
