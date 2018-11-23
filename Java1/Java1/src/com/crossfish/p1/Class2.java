package com.crossfish.p1;

public class Class2 {

  /**
   * aaaaaaaaaaaaaaaaaa
   */
  public void aaa() {
    System.out.println("called aaa");
  }

  /**
   *
   */
  public void bbb() {
    System.out.println("called bbb");
    String str1 = Messages.getString("Class2.2");
    System.out.println(str1.toString());
  }
}
