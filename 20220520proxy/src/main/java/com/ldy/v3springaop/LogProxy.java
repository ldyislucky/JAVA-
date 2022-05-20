package com.ldy.v3springaop;

/**
 * @author : ldy
 * @version : 1.0
 */
public class LogProxy {
    public void before(){
        System.out.println("坦克开始移动！");
    }
    public void after(){
        System.out.println("坦克移动结束！");
    }
}
