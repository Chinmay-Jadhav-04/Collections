package com.July524;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		
		a1.add("Red");
		a1.add("Black");
		a1.add("Grey");
		a1.add("Red");
		a1.add("Blue");
		a1.add("Green");
		a1.add("Yellow");
		a1.add("White");

System.out.println(a1.size());

a1.add("Purple");
System.out.println(a1);

a1.add(2,"Grey");
System.out.println(a1);

a1.set(3,"Blue");
System.out.println(a1);

System.out.println(a1.get(4));

System.out.println(a1.indexOf("Grey"));
a1.remove(2);
System.out.println(a1);
a1.remove("red");

System.out.println(a1);
a1.clear();

if(a1.isEmpty()) {
	System.out.println("List is notavailable");
}
else {
	System.out.println(a1);
}

	}

}
