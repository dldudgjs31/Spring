package com.user4;

public class User {
   private UserService userService;
   
   public void setUserService(UserService userService) {
      this.userService = userService;
   }



   public void write() {
      String s = userService.message();
      System.out.println("-- setter을 이용한 의존성 주입: P 네임스페이스 --");
      System.out.println(s);
   }

   
}