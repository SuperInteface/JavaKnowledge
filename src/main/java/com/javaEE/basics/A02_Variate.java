package com.javaEE.basics;

/**
 * A02_variate 变量
 * 
 * 	程序= 算法+数据结构 
 * 	算法: (https://baike.baidu.com/item/%E7%AE%97%E6%B3%95)百度百科 
 * 	数据结构: (https://baike.baidu.com/item/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84/1450)百度百科
 * 
 * 	变量是数据结构之一,变量就是内存中的某一存储空间,用来存储运算过程中的数据. 
 * 	如: 
 * 		int x1 = 5; 
 * 		double y1 = 2.8d;
 * 		Integer x2 = 5;
 * 
 * @author github: SuperInteface
 * @date 2019年5月8日
 */
public class A02_Variate {

	/*
	 * 1)变量的声明 
	 * 2)变量的命名规范 
	 * 3)变量的初始化 
	 * 4)变量的访问
	 */
	public static void main(String[] args) {

		// 1)变量的声明*****声明变量需要 类型与名称 . 如下声明一个类型为int,名称为x1的变量,以及同时声明int类型x2, x3

		int x1;
		int x2, x3;

		// 2)变量的命名规范*****变量名可以由字母、数字、"_"、"$"组成,但不能使用数字开头,不能使用保留字.且区分大小写,中文可以作为变量名(实际开发中没人这么用,了解即可)
		
		int z_1Z$; // 正确
//		int 222z; // 错误,原因:不能以数字开头.(该行开头以注释,打开注释//即报错)
//		int for;  // 错误,不能使用保留字.(该行开头以注释,打开注释//即报错)

		// 3)变量的初始化 初始化有两种方式,生命的同时初始化,先声明,后初始化 如下
		
		int num = 1; // 声明同时初始化
		int num1;	 // 先声明,后初始化
		num1 = 9;
		
		// 4)变量的访问 可以对变量中的值进行操作,存取,计算... 如下声明一个int类型,名称为sum,初始值为1的变量,对其进行+1计算,并输出计算结果
		
		int sum = 1;
		sum = sum+1;
		System.out.println(sum);
		
	}

}
