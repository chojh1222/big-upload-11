package com.bestiansoft.bigupload;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("asdf.txt");
		BufferedInputStream bis = new BufferedInputStream(is);
		int r;
		byte[] a = new byte[5]; 
		
		is.read(a, 0, 5);
		for(byte b : a) {
			System.out.println((char)b);
		}
		
//		r = bis.read();
//		bis.mark(1000);
//		
//		r = bis.read();
//		r = bis.read();
//		bis.reset();
//		
//		
//		while((r = bis.read()) != -1) {
//			System.out.println((char)r + " " + r);
//		}
		
	}

}
