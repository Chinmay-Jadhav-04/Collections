package com.july10;

abstract class Operation{
	abstract int addition(int i,int j);
	abstract int subtraction(int i,int j);
	abstract int multiplication(int i,int j);
	abstract int division(int i,int j);
	
	void display() {
		System.out.println("This is a Operation");
	}
	 
}
class Maths extends Operation{
	int addition(int i,int j) {
		return i+j;
	}
	int subtraction(int i,int j) {
		return i-j;
	}
	int multiplication(int i,int j) {
		return i*j;
	}
	int division(int i,int j) {
		return i/j;
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Maths m=new Maths();
		m.display();
		
		System.out.println("Addition:"+m.addition(30,40));
		System.out.println("Subtraction:"+m.subtraction(33, 24));
		System.out.println("Multiplication:"+m.multiplication(55, 8));
		System.out.println("Division:"+m.division(600, 2));

	}

}
