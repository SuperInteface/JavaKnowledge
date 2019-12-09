package com.javaEE.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 	变量-续
 * @author	github: SuperInteface
 * @date	2019年5月8日
 */
public class A03_Variate02 {
	
	/*
	 * 	变量依据数据类型分为	(基本数据类型与引用类型变量)
	 * 		1)基本数据类型8种
	 * 		2)引用数据类型有	类(class),接口(inteface),数组([ ])
	 */
	public static void main(String[] args) {
		
		// 1) 八种基本数据类型 byte short int long float double boolean char
		
		// 整型四种
		byte bt 	= 1 ;		// 1 字节     -128~127 
		short st 	= 2 ;		// 2 字节     -32768~32767 
		int it 		= 3 ;		// 4 字节     -2^31~2^31-1
		long lg 	= 300l ;	// 8 字节     -2^63~2^63-1
		// 浮点型两种
		float ft 	= 5.5f ;	// 4 字节     32位IEEE 754单精度(有效位数6~7位)
		double db 	= 8.8d ;	// 8 字节     64位IEEE 754双精度(有效位数15位)
		// 逻辑型一种
		boolean bl 	= false ;	// 1 字节     true或者false
		// 字符型一种
		char cr 	= 'c' ;		// 2 字节     整个Unicode字符集
		
		
		// 2) 三种引用类型 (类class+接口interface+数组array) 
			// 类class
		String str 	= "str"; 	// 类String引用类型
			// 接口inteface
		List lst ;				// 接口List引用类型(这里先不初始化,原因是接口初始化需要指向一个他的实现类,这里只需要了解这是一个接口类型的引用即可,后续会对接口初始化进行解释)
			// 数组array
		int[] arint = new int[5];// 数组[]代表数组,其声明方式有当前行以及如下几种
		int[] arit1 = {};		// 声明一个int[]数组,元素为空.
		int[] arit2 = {1,2,-8};	// 声明一个int[]数组,元素有3个.
		int[] arit3 = new int[8];// 声明一个int[]数组,元素有8个,其元素值都为默认值0.
		int[] arit4 = new int[]{1,2,3,4,5};// 声明的同时,初始化其元素的值.
		int arit5[] ;	// [] 可在前,在后.以上所有[] 都可以放在后面
		
		// 多维数组
		int [][] ar1 = {{1,2,3},{3,2,1}}; // 二维数组打个比方就如,电影院前两排,第一排第一个人坐标1,1     第二排第一个人坐标2,1 如此理解二维数组
		// 三维数组		如何理解三维数组,可以把它想象成一个魔方
		int [][][] ari1 = new int[][][]{	{{0,1,2},{3,4,5},{6,7,8}},	{{9,10,11},{12,13,14},{15,16,17}},	{{18,19,20},{21,22,23},{24,25,26}}	};
		/*
		 * 	该魔方的三视图分别是	
		 * 		俯视图
		 * 	0	1	2
		 * 	3	4	5
		 * 	6	7	8
		 * 		左视图
		 * 	0	3	6
		 * 	9	12	15
		 * 	18	21	24
		 * 		正视图
		 * 	6	7	8
		 * 	15	16	17
		 * 	24	25	26
		 */
		
		// 相信你理解了三维数组,那么四维数组肯定也难不到你,可以想象有三个魔方,每一个魔方都是一个三维数组
		//										下面这个是第一个魔方																		下面是第二个魔方																			下面是第三个魔方
		int [][][][] aart = new int[][][][] {	{{{0,0,0},{1,1,1},{2,2,2}},{{3,3,3},{4,4,4},{5,5,5}},{{6,6,6},{7,7,7},{8,8,8}}},		{{{0,0,0},{1,1,1},{2,2,2}},{{3,3,3},{4,4,4},{5,5,5}},{{6,6,6},{7,7,7},{8,8,8}}},		{{{0,0,0},{1,1,1},{2,2,2}},{{3,3,3},{4,4,4},{5,5,5}},{{6,6,6},{7,7,7},{8,8,8}}}	};
		// 多维数组了解到四维就够了,平时用到三维数组都很少.面试没人抓着多维数组不放的,除非非常特殊的情况.
		
		
		/*
		 * 	基本类型之间的相互转换
		 * 		从小到大(隐式转换-自动转换)
		 * 		byte -> short -> (int = char) -> long -> float -> double
		 * 		从大到小(强制转换-手动转换)
		 * 		double -> float -> long -> (char = int) -> short -> byte
		 */
		
		// 举个栗子(隐式转换)
		double db1 = 2.2d;
		int it1 = 5;
		db1 = it1;
		System.out.println(db1); // 输出结果 5.0
		
		// 再举个栗子(强制转换)
		byte by1 = 5;
		float ft1 = 5.5f;
		by1 = (byte)ft1; // 在赋值之前加括号()表示强制转换,将括号后的数据类型强制转换为括号内的数据类型
		
		Integer i1 = 5;
		Object map = "C";
		i1 = (Integer)map;
		System.out.println(i1); // 报错     java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		
		
		
		
	}
	
}
