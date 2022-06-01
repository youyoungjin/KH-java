package com.day21;

import com.day16.*;

public class DuckTest {
	MallardDuck myDuck = null;
	MallardDuck getInstance() {
		if(myDuck==null) {
			myDuck = new MallardDuck();
		}
		return myDuck;
	}
	void test() {
		getInstance().display();//NullPointerException발생
	}

	public static void main(String[] args) {
		DuckTest dt = new DuckTest();
		dt.test();

	}

}
