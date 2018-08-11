package com.hongjian.aspectj;

/**
 * 主函数以及AspectJ测试
 *
 * @author hongjian
 * @date 2018/8/5
 */
public class HelloAspectJ {

    public void sayHello() {
        System.out.println("Hello AOP");
    }

    public static void main(String[] args) {
        new HelloAspectJ().sayHello();
    }
}
