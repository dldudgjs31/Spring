package com.user3;

public class User {
   private UserService userService;
   
   public void setUserService(UserService userService) {
      this.userService = userService;
   }



   public void write() {
      String s = userService.message();
      System.out.println("--setter�� �̿��� ������ ����--");
      System.out.println(s);
   }

   
}