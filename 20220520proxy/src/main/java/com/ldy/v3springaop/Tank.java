package com.ldy.v3springaop;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Tank {
  public void move(){
    try {
      System.out.println("坦克正在移动！");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
