package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long total = 0l;
		String temp = "";
		System.out.println("Refers integers for sum them (valid sum by enter empty field):");
		
		
		while (true) 
		{
			try{
				temp = scan.nextLine();
				if(!temp.isEmpty())
				{
					total += Integer.valueOf(temp);
				}
				else
				{
					break;
				}
			}
			catch (NumberFormatException e)
			{
				System.err.println("Ignored integer entry !");
				System.err.println(e);
			}
		}
		
		System.out.println("Total ="+total);
		scan.close();

	}

}
