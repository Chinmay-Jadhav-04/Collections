package com.july10;
 abstract class info{
	 void disp() {
		 String name="Chinmay Jadhav";
		 System.out.println(name);
	 }
	 abstract void show();
 }
 abstract class Info3{
	 void add() {
		 int i=20,j=15;
		 System.out.println(i+j);
	 }
 }
 
 class Info2 extends info{

	@Override
	void show() {
		System.out.println("This is a show method()");
	}
	
 }
 class Info4 extends Info3{
	 
 }
public class AbstractDemo2 {

	public static void main(String[] args) {
		Info2 i1=new Info2();
		i1.disp();
		i1.show();
		Info4 i=new Info4();
		i.add();

	}

}
