package com.aaa;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame0604 extends JFrame{
	
	public MyFrame0604() {
		setSize(500,300);
		JButton ok = new JButton("OK");
		JPanel north = new JPanel();
		north.add(ok);
		add(north, BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrame0604 frame = new MyFrame0604();
	}
}
