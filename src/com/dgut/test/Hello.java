package com.dgut.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LongMa
 * @date 2019/6/28 - 19:52
 */
public class Hello {

    private static  final int ASS_SS=10;

    public static void main(String[] args) {
        int a = 3;
        if (a > 2) {
            System.out.println(a + "aff");
        }
        List list = new ArrayList();
        Date date = new Date();
        list.add(a);
        method2();
    }

    public static  void method2(){

    }
}
