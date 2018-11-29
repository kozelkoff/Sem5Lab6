package sem5lab6proj1;

import java.util.Scanner;

public class Sem5Lab6Proj1 {

  public static void test() {
    String result;
    System.out.println("Type a string");
    Scanner in = new Scanner(System.in);
    result = in.nextLine();
    System.out.println("You string is: " + result);
  }

  public static void main(String[] args) {
    test();
  }
}
