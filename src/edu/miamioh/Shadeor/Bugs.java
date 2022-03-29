package edu.miamioh.Shadeor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Bugs {
	public static void main(String args[]) throws FileNotFoundException{

		PrintWriter PW = new PrintWriter(new File(getText(BugSubmision.t1)));

		PW.println(getText(BugSubmision.t2));
		
		PW.close();
	}//End of main

	private static String getText(Object t2) {
		
		return null;
	}



}
