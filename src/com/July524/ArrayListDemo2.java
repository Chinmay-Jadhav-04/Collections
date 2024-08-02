package com.July524;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter names (type 'quit' to stop):");

    while (true) {
      String input = scanner.nextLine();

      if (input.equalsIgnoreCase("quit")) {
        break;
      }

      names.add(input);
    }

    scanner.close();

    System.out.println("You entered the following names:");
    for (String name : names) {
      System.out.println(name);
    }
  }
}