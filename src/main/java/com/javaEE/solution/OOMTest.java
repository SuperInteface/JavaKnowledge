package com.javaEE.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OOMTest {
    /*
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> lists = new ArrayList<String>();
                for (int i = 0; i <= 10000000; i++){
                    System.out.println(i);
                    lists.add(new String("==" + new Random().nextInt() + ""));
                }
                for (int i = 0; i <= 10000000; i++)
                    System.out.println(lists.get(i));
            }
        }).start();
    }*/

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> lists = new ArrayList<String>();
                for (int i = 0; i <= 10000000; i++){
                    if(lists.size() > 5000){
                        // 提交数据库,但不提交事务,并清除list占用的内存.并在循环外面再提交一次数据并提交当前数据库的事务
                        // ...
                        lists.clear();
                    }
                    System.out.println(i);
                    lists.add(new String("==" + new Random().nextInt() + ""));
                }
                for (int i = 0; i <= 10000000; i++)
                    System.out.println(lists.get(i));
            }
        }).start();
    }
}
