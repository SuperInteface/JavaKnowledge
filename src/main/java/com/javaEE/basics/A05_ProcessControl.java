package com.javaEE.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * 	A05流程控制
 * @author	github: SuperInteface
 * @date	2019年6月12日
 */
public class A05_ProcessControl {
	
	public static void main(String[] args) {
		
		/*
		 * 	流程控制关键字
		 * 	1) if, if else, if elseif else
		 * 	2) switch case
		 * 	3) while, do while
		 * 	4) for, foreach
		 */
		
		/*	流程控制之if
		 * 	语法结构----- if(boolean) {...} 
		 * 	语法解释----- if关键字后面一对小括号(),括号内是boolean类型,当小括号内的值为true时,执行之后的花括号内的程序,如果没有花括号则执行后面以分号; 结尾的一句程序
		 */
		System.out.println("\n==========if else==========");
		boolean flag = true;
		if(flag) {
			System.out.println("if(boolean)的圆括号内值为true");
		}
		// 没有花括号,则会执行后面一个以分号;结尾的一句程序
		if(flag) 
			System.out.println("现在if(boolean)后没有花括号,且flag为true,我才会被输出到控制台.");
		
		/*
		 * 	流程控制之if else
		 * 	综上if(boolean){...} 我们已经知道 当圆括号内(boolean)为true时,会执行其后的花括号{...}内的程序
		 * 	那如果if(boolean) 不为true呢,如果为false时应当如何?
		 * 	这个时候就需要else关键字了.
		 */
		flag = false;
		if(flag) {
			System.out.println("现在flag为true");
		}else {
			System.out.println("现在flag为false");
		}
		// 上述if else 就比如生活中的支付场景,有的地方支持手机支付,有的不支持,那么这个时候就可以使用到if else分支流程控制, 当可以使用手机支付时,进入if(boolean){...}的花括号内进行手机支付,不支持手机支付的,可以选择else{...}内的现金支付方式.
		
		/*	依然是支付场景,比如你去超市买矿泉水,你可以选择支付宝支付,微信支付,现金支付,刷卡支付.这个场景if else两条分支已经满足不了如上业务场景了,那么这个时候我们应该如何呢?
		 *	这个时候就需要使用if elseif else 了
		 */
		
		int payType = 0; 
		/*
		 * 0 现金支付
		 * 1 支付宝支付
		 * 2 微信支付
		 * 3 刷卡支付
		 */
		if(payType == 0) {
			System.out.println("当前是现金支付");
		}else if(payType == 1) {
			System.out.println("当前是支付宝支付");
		}else if(payType == 2) {
			System.out.println("当前是微信支付");
		}else if(payType == 3) {
			System.out.println("当前是刷卡支付");
		}else {
			System.out.println("未知支付方式");
		}
		
		
		/*
		 *	流程控制之switch case
		 *	语法 switch(参数) 括号内的参数可以使用byte,short,int,char,String,enum 进行判断
		 *	case xx : 
		 *	...; 
		 *	break;
		 *	
		 *	case xx : 
		 *	...;
		 *	break;
		 *
		 *	default:
		 *	...;
		 *
		 *	注: xx的类型与switch(xx)括号内的参数类型应一致	
		 *	default 是都不满足的情况下,会执行的逻辑.
		 */
		System.out.println("\n==========switch case==========");
		int n = 5;
		switch(n) {
		case 1:
			System.out.println("此时n=1");
			break;
		case 2:
			System.out.println("此时n=2");
			break;
		case 3:
			System.out.println("此时n=3");
			break;
		case 4:
			System.out.println("此时n=4");
			break;
		case 5:
			System.out.println("此时n=5");
			break;
		case 6:
			System.out.println("此时n=6");
			break;
		default :
			System.out.println("n的值不满足当前所有的情况");
		}
		
		System.out.println("\n==========while==========");
		/*
		 * 	语法 while(boolean){...}
		 * 	解释 当满足while(boolean)内的条件时,就会去执行{...}内的逻辑
		 * 	场景 播放器播放音乐,当点击播放时,就会放出音乐,当点击暂停时,就不会播放音乐.
		 */
		boolean playType = false;
		playType = true; // 打开播放器
		while (playType) {
			System.out.println("播放器正在播放音乐青花瓷~~~");
			System.out.println("播放器正在播放音乐稻香~~~");
			System.out.println("播放器正在播放音乐千里之外~~~");
			System.out.println("点击暂停按钮");
			playType = false;
		}
		
		/*
		 * 	do while
		 * 	语法 do{...}while(boolean);
		 * 	解释,一遍do{...}内的程序,再进行判断while(boolean) while条件满足,再次继续执行do{...}内程序,否则不执行.
		 */
		boolean fflag = true;
		int num = 0;
		boolean likeType = false; // 西瓜喜好 false不喜欢, true 喜欢
		do {
			
			if(num == 0)System.out.println("试吃西瓜第一次体验");
			if(num != 0)System.out.println("你买了一个西瓜.");
			
			if(likeType) {
				System.out.println("觉得西瓜好吃,设置fflag为true,do while 继续执行");
				fflag = true;
			}else {
				System.out.println("觉得西瓜不好吃,设置fflag为false,do while不在继续执行");
				fflag = false;
			}
			
		}while(fflag);
		
		System.out.println("\n==========for循环========");
		/*
		 * 	流程控制之for循环
		 * 	语法 for(x;boolean;y){...} 其中x部分代表循环变量的的初始化,一般在这里进行初始化,当然也可以在for之前进行初始化,boolean处是循环的条件,y处是变量控制,通常通过变量的加减乘除来进行控制循环
		 */
		for(int i=0;i<10;i++) {
			if(i==2) continue; // continue表示跳出当前这次循环
			System.out.println("当前i为 : " + i);
			if(i==8) break; // break 表示结束当前循环体
		}
		System.out.println("\n==========for循环的break应用");
		loop1:
		for(int i=1;i<5;i++) {
			if(i==3) break loop1;
			for(int o=1;o<5;o++) {
				System.out.println("i=" + i + " o=" + o);
			}
		}
		
		System.out.println("\n==========for循环之 99乘法表==========");
		for(int i=1;i<=9;i++){
			for(int o=1;o<=i;o++) {
				System.out.print(o+"x"+i+"="+i*o + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("\n==========for循环之冒泡排序");
		int [] arr = {6,17,12,94,42,82,711,566,123,45,817,15,51,823,7278,222,171,6465,79,81,23,55}; 
		for(int i = 0;i<arr.length;i++) {
			for(int o=0;o<arr.length-i-1;o++) {
				if(arr[o]>arr[o+1]) {
					int x  = arr[o];
					arr[o] = arr[o+1];
					arr[o+1] = x;
				}
					
			}
		}
		
		for(int p = 0;p<arr.length;p++) {
			System.out.print(arr[p] + " ");
		}
		
		System.out.println("\n==========foreach循环");
		/*
		 * 	流程控制之foreach,增强for循环
		 * 	语法for(obj, objList){...}
		 */
		List<String> strList = new ArrayList<String>();
		strList.add("壹");
		strList.add("贰");
		strList.add("叁");
		
		for (String str : strList) {
			System.out.println(str);
		}
		
		/*
		 * 	这里的List<String> strList = new ArrayList<String>();
		 * 	是一个集合,后续会了解,这里只需要把它理解为数组一样就行, foreach可以对这个数组循环,其中str 代表其中每一个元素
		 */
		
		
		
		
	}

}
