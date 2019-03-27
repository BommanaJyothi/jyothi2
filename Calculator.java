
// calculator program

//importing necessary libraries
import java.util.Scanner;

class program{
	
	// addition function
	void add(){
		// taking a user input for the addition of n numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of numbers to be added\n");
		int n=sc.nextInt();
		int a, sum=0;
		for(int i=0;i<n;i++){
			// reading n inputs from the user iteratively
			a= sc.nextInt();
			sum+=a;
		}
		// printing the result of addition of the n numbers 
		System.out.println("Result"+" "+ sum);
	}
	
	
	// multiplication function
	void mul(){
		// taking a user input for the addition of n numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of numbers to be multiplied\n");
		int n=sc.nextInt();
		int a, sum=1;
		for(int i=0;i<n;i++){
			// reading n inputs from the user iteratively
			a= sc.nextInt();
			sum*=a;
		}
		// printing the result of multiplication of the n numbers 
		
		System.out.println("Result"+" "+ sum);
	}
	
	
	// division of the two numbers 
	
	void div(int a, int b){
		float c;
		
		//type casting the integer result into float
		
		c =(float) a/b ;
		
		// printing the division of the two numbers
		
		System.out.println("Result"+" "+ c);
	}
	
}

class calculator{
	// main function
	public static void main(String args[]){
		// creating an object or instance to the program class 
		
		program p= new program();
		
		Scanner sc=new Scanner(System.in);
		
		// providing options to the users
		
		System.out.println("1.addition\n2.multiplication\n3.division\n");
		System.out.println("enter option\n");
		int n;
		// take an option from the user
		n=sc.nextInt();
		
		switch(n){
			case 1: p.add();
					break;
			case 2: p.mul();
					break;
			case 3:
				int a,b;
				a= sc.nextInt();
				b= sc.nextInt();
				p.div(a,b);
				break;
		}
	}
}