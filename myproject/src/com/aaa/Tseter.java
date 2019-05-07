package com.aaa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tseter {

	public static void main(String[] args) {
		int n = Integer.parseInt("36");
		
		/*try {
			FileReader fr = new FileReader("aa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
		/*File file = new File("aa.txt");
		System.out.println(file.canExecute());
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		
		if(file.exists()) {
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());	
		}*/
		
		/*File dir = new File("C:\\AppServ");
		if (dir.exists()&&dir.isDirectory()) {
			String[] file = dir.list();
			for(String s :file)
			System.out.println(s);
		}*/
		
		File dirr = new File("C:\\AppServ");
		if (dirr.exists()&&dirr.isDirectory()) {
			File[] files = dirr.listFiles();
			for(File f: files) {
				if (f.isFile()) {
					System.out.println(f.getName());
					System.out.println(f);
					System.out.println(f.toString());
				}
			}
			System.out.println(dirr.mkdir());
			File dd = new File(dirr,"aaa\\bbb\\ccc");
			System.out.println(dd.mkdirs());
			//System.out.println(dd.delete());
		}
		for(int i = 0;i<2000000;i++);
		
	}

}
