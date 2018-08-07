package com.haieros.threads;

/**
 * Created by Kang on 2018/5/7.
 */

public class BreakAndContinue {

    public static void main(String[] agrs){

        retry:
        for (int i = 0; i < 5; i++) {
            System.out.println("i---:"+i);
            for (int j = 0;j < 10;j++){
                if(j%2 == 0) {
                    break retry;
                }
                System.out.println("j----:"+j);
            }
            System.out.println("-----------------------------------------------");
        }
        System.out.println("------------------=====--------------------");
    }
}
