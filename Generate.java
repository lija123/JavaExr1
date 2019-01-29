package org.jclass.main;

public class Generate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thousand();
		fiveThousand();
		oddThousand();
	}

	public static void thousand()
	{
		System.out.println("First thousand numbers");
		for(int i=1;i<=1000;i++)
		{
			System.out.print(i+",");
		}
	}
	public static void fiveThousand()
	{
		System.out.println();
		System.out.println("First thousand multiplies of 5");
		for(int i=0;i<=1000;i+=5)
		{
			System.out.print(i+" , ");
		}
	}
	public static void oddThousand()
	{
		System.out.println();
		System.out.println("First thousand Odd numbers");
		for(int i=1;i<=1000;i+=2)
		{
			System.out.print(i+" , ");
		}
	}
}
