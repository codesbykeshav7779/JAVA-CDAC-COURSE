   package com.dkte;

import java.io.File;
import java.util.Date;
import java.util.Scanner;


public class FileDemo01Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String path = sc.nextLine();
		
		File f = new File(path);
	
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("File Name: " + f.getName());
				System.out.println("File Size: " + f.length());
				System.out.println("Last Modified: " + new Date(f.lastModified()));
			}
			else if(f.isDirectory()) {
				System.out.println("Dir Name: " + f.getName());
				String[] files = f.list();
				for (String file : files)
					System.out.println(file);
			}
		}
		else
			System.out.println("Invalid Path.");
	}
}
