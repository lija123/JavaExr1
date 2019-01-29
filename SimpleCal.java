package org.jclass.main;
import java.util.Scanner;
public class SimpleCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float operand1=0,operand2=0,ans=0;
		
		char operator;
		System.out.println("Enter the first number");
		operand1=sc.nextFloat();
		System.out.println("Enter the Second number");
		operand2=sc.nextFloat();
		System.out.println("Enter the operator(+ ,_ ,* , /,%)");
		 operator = sc.next().charAt(0);
		
		switch(operator) {
		
			case '+':
				ans=operand1+operand2;
				break;
			case '-':
				ans=operand1+operand2;
				break;
			case '*':
				ans=operand1+operand2;
				break;
			case '/':
				ans=operand1+operand2;
				break;
			case '%':
				ans=operand1+operand2;
				break;
			default:
				System.out.println("Invalid entries");
				
		}
		
    System.out.println(operand1+" "+operator+" "+operand2+" = "+ans);
	}

}
