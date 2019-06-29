package com.dgut.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LongMa
 * @date 2019/6/28 - 21:59
 */
public class TemplatesTest {

    public static final int a=10;
    public static final int b=20;
    public static final int c=30;
    /**
     *客户编号
     */
     private Integer id;
     /**
      *客户姓名
      */
      private String name;

    
    //模板一:psvm
    public static void main(String[] args) {

        //模板二:sout
        System.out.println("hello");
        System.out.println("TemplatesTest.main");
        int a[]={1,2,3,4};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        List list=new ArrayList();
        list.add(0,45);
        list.add("kan");
        list.add(2,"jian");
        for (Object object:list){
            System.out.println(object);
        }
    }

    public void testUpdate(){

    }
}
