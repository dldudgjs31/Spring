package com.user6;

public class User {
   private UserService userService;
   
   public void setUserService(UserService userService) {
      this.userService = userService;
   }



   public void write() {
      String s = userService.message();
      System.out.println("-- �ڵ����� ������ ���� --");
      System.out.println(s);
   }

   
}