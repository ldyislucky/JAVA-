package com.ldy;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Main {
  public static void main(String[] args) {
    new proxyTime(new proxyLog(new tank())).move();
  }
}

interface Movable{
  void move();
}

class tank implements Movable{
  public tank() {
  }

  @Override
  public void move() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class proxyTime implements Movable{
  Movable m;

  public proxyTime(Movable m) {
    this.m = m;
  }

  @Override
  public void move() {
    long l = System.currentTimeMillis();
    m.move();
    long l1 = System.currentTimeMillis();
    System.out.println(l-l1);
  }
}

class proxyLog implements Movable{
  Movable m;

  public proxyLog(Movable m) {
    this.m = m;
  }

  @Override
  public void move() {
    System.out.println("坦克开始运行了！");
    m.move();
    System.out.println("坦克运行结束了！");
  }
}
