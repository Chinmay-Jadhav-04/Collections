package com.july10;

import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		  ConcurrentHashMap<Integer,String>h=new ConcurrentHashMap<>();
		  Thread t1=new Thread() {
		  	public void run() {
		  		h.put(101,"Chinmay");
		  		System.out.println(h.get(101));
		  	}
		  };

		  Thread t2=new Thread() {
		  	public void run() {
		  		h.put(102,"Aum");
		  		System.out.println(h.get(102));
		  	}
		  };

		  t1.start();
		  t2.start();

		 


	}

}
