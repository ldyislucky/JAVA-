package com.ldy.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Main {
  public static void main(String[] args) {
    BulletPool bulletPool = new BulletPool();
    for (int i = 0; i < 10; i++) {
      Bullet bullet = bulletPool.getBullet();
      System.out.println(bullet);
    }
  }
}
class Bullet{
  public UUID id = UUID.randomUUID();
  boolean living = true;

  @Override
  public String toString() {
    return "Bullet{" +
            "id=" + id +
            ", living=" + living +
            '}';
  }
}
class BulletPool{
  List<Bullet> bullets = new ArrayList<>();
  {
    for (int i = 0; i < 5; i++) {
      bullets.add(new Bullet());
    }
  }

  public BulletPool() {
  }
  public Bullet getBullet(){
    for (int i = 0; i < bullets.size(); i++) {
      Bullet bullet = bullets.get(i);
      if (!bullet.living)return bullet;
    }
    return new Bullet();
  }
}

