package com.androidcourse.lecture4.lectures;

public class Lecture {
	private String name;
	private long duration;
	//etc
	
	public Lecture() {
		name = "";
		duration = 120;
	}
	
	public Lecture(String name) {
		this.name = name;
		duration = 120;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			return false;
		}
		
		if(!(obj instanceof Lecture)) {
			return false;
		}
		
		Lecture lectureObj = (Lecture)obj;
		
		if(!name.equals(lectureObj.name)) {
			return false;
		}
		
		if(duration != lectureObj.duration) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		String a = "";
		a = a + this.name;
		a = a + " ";
		a = a + this.duration;
		
		return a;
	}
}
