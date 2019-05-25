package com.px.java;

import com.px.bean.Customer;

import java.util.ArrayList;

public class Template {

    private static final Customer cust = new Customer();

    public static void main(String[] args) {
        System.out.println("hello");
        int num = 1;
        System.out.println("num = " + num);

        String[] arr = new String[]{"1","2"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("-------------");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

        ArrayList<String> lists = new ArrayList<>();
        for (String list : lists) {
            
        }
        if (lists == null) {
            
        }
        if (lists != null) {
            
        }
        if (lists != null) {
            
        }
    }
}
