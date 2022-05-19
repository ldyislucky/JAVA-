package com.ldy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Main {
  public static void main(String[] args) {
    Tank tank = new Tank();
    System.getProperties().put("jdk.proxy.ProxyGenerator.saveGenerateFiles","true");
    Movable m = (Movable)Proxy.newProxyInstance(tank.getClass().getClassLoader(),//tank.getClass()替换成Tank.class也可
            new Class[]{Movable.class},//指定实现Movable接口
            new loghander(tank));//添加辅助功能
    m.move();
  }
}
interface Movable{
  void move();
}
class Tank implements Movable{
  @Override
  public void move() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
class loghander implements InvocationHandler{//InvocationHandler是动态代理的意思
  Tank tank;

  public loghander(Tank tank) {
    this.tank = tank;
  }

  @Override
  public Object invoke(Object proxy,//生成的代理对象，即Main对象中的m,一般用不上这个参数
                       Method method,//move()方法，可是万一某个接口之中有好几个方法呢？
                       Object[] args)
          throws Throwable {
    System.out.println("开始移动");
    Object o = method.invoke(tank, args);/*method指的是tank.move()中的move方法，
                                            tank指的是tank.move()中的tank*/
    System.out.println("移动结束");
    return o;
  }
}
