package com.user5;

public class User {
   private  UserService userService;
   
   public void setUserService(UserService userService) {
      this.userService = userService;
   }

   public void write() {
      String s = userService.message();
      System.out.println("--�÷��� Ÿ��--");
      System.out.println(s);
   }
}