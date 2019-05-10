package com.javaEE.basics;

/**
 * 	运算符分为算术运算符、逻辑运算符、关系运算符三种
 * @author	github: SuperInteface
 * @date	2019年5月8日
 */
public class A04_OperationalCharacter {

	/*
	 * 1) 算数运算符 加(+), 减(-), 乘(*), 除(/), 取模(%)就是取余数, 自增(++), 自减(--)
	 * 2) 关系运算符 > < >= <= == !=
	 * 3) 逻辑运算符 & | !  短路( && || )
	 */
	public static void main(String[] args) {
		
		// 算术运算符 
		int i1 = 2;
		int i2 = 6;
		System.out.println("==========");
		System.out.println(i2+i1);
		System.out.println(i2-i1);
		System.out.println(i2*i1);
		System.out.println(i2/i1);
		System.out.println(i2%i1);
		System.out.println(i1++); // ++与-- 写在后面,表示先参与程序的计算后自增或者自减,在这里会先输出i1,后自增
		System.out.println(i1);
		System.out.println(++i1); // ++写在前面表示先自增,后参与输出 -- 同理
		System.out.println(i2--);
		System.out.println(--i2);
		System.out.println("==========");
		
		// 关系运算符
		boolean flag = false;
		double db1 = 2.2d;
		float ft1 = 3.3f;
		flag = db1 > ft1;
		System.out.println(flag);
		flag = db1 < ft1;
		System.out.println(flag);
		flag = db1 >= ft1;
		System.out.println(flag);
		flag = db1 <= ft1;
		System.out.println(flag);
		flag = db1 == ft1;
		System.out.println(flag);
		flag = db1 != ft1;
		System.out.println(flag);
		
	}

}
