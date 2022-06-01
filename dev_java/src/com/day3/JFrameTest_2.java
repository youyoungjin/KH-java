package com.day3;

import javax.swing.JFrame;

import 프로그램.구구단게임2;
public class JFrameTest_2 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 600;
	public void initDisplay() {
		System.out.println();
		jf.setSize(500,400);
		jf.setSize(width,400);
		jf.setLayout(null);
		jf.setVisible(true);
		
	}// end of initDisplay
	public static void main(String[] args) {
		JFrameTest_2 jtf = new JFrameTest_2();
		
		jtf.initDisplay();
	}

}// end of JFrameTest
