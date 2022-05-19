package com.ldy.v1;

import java.util.ArrayList;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Main {
  public static void main(String[] args) {
    Child child = new Child();
    child.wakeUp();
  }
}
  class Child{
    private boolean cry = false;
    private ArrayList<Observer> observes = new ArrayList<>();
    {
      observes.add(new Dad());
      observes.add(new Dog());
      observes.add(new Mum());
    }

    public Child() {
    }

    public boolean wakeUp(){
      System.out.println("小孩醒了！开始哭了！");
      WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "床上");
      for (Observer o : observes){
        o.actionWakeUp(event);
      }
      return cry=true;
    }
  }
  class WakeUpEvent{
    long timetemp;
    String loc;

    public WakeUpEvent(long timetemp, String loc) {
      this.timetemp = timetemp;
      this.loc = loc;
    }
  }
  interface Observer{
    void actionWakeUp(WakeUpEvent wakeupevent);
  }
  class Dad implements Observer{
    public void feed(){
      System.out.println("爸爸喂！");
    }

    @Override
    public void actionWakeUp(WakeUpEvent wakeupevent) {
      feed();
    }
  }
  class Dog implements Observer{
    public void shout(){
      System.out.println("狗叫!");
    }
    @Override
    public void actionWakeUp(WakeUpEvent wakeupevent) {
      shout();
    }
  }
  class Mum implements Observer{
    public void comfort(){
      System.out.println("妈妈安慰！");
    }
    @Override
    public void actionWakeUp(WakeUpEvent wakeupevent) {
      comfort();
    }
  }

