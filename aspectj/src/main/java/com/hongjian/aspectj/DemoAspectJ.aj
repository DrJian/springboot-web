package com.hongjian.aspectj;

/**
 * 切面类
 *
 * @author hongjian
 * @date 2018/8/5
 */
public aspect DemoAspectJ {

    /**
     * 定义切点,日志记录切点
     */
    pointcut recordLog():call(* HelloAspectJ.sayHello(..));

    /**
     * 定义切点,权限验证(实际开发中日志和权限一般会放在不同的切面中,这里仅为方便演示)
     */
    pointcut authCheck():call(* HelloAspectJ.sayHello(..));

    /**
     * 定义前置通知!
     */
    before():authCheck() {
        System.out.println("sayHello方法执行前验证权限");
    }

    /**
     * 定义后置通知
     */
    //after():recordLog() {
    //    System.out.println("sayHello方法执行后记录日志");
    //}

    Object around():recordLog() {
        System.out.println("环绕前置");

        Object result = proceed();

        System.out.println("环绕后置");

        return result;
    }
}