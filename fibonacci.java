package org.jclass.main;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0, cnt=10;
		Scanner cnt1=new Scanner(System.in);
		//cnt=Integer.parseInt(args[0]);
		cnt=Integer.parseInt(cnt1.nextLine());
		System.out.print(n1+"  "+n2+"  ");
		for(int i=2;i<cnt;i++) {
			
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
		

	}

}
