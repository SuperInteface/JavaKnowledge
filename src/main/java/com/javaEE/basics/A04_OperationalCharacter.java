package com.javaEE.basics;

/**
 * 	运算符分为算术运算符、逻辑运算符、关系运算符、位运算符四种
 * @author	github: SuperInteface
 * @date	2019年5月8日
 */
public class A04_OperationalCharacter {

	/*
	 * 1) 算数运算符 加(+), 减(-), 乘(*), 除(/), 取模(%)就是取余数, 自增(++), 自减(--)
	 * 2) 关系运算符 > < >= <= == !=
	 * 3) 逻辑运算符 & | !  短路( && || )
	 * 4) 位运算符
	 */
	public static void main(String[] args) {
		
		// 算术运算符 
		int i1 = 2;
		int i2 = 6;
		System.out.println("==========");
		System.out.println(i1+"+"+i2+" = "+(i2+i1));
		System.out.println(i1+"-"+i2+" = "+(i2-i1));
		System.out.println(i1+"*"+i2+" = "+(i2*i1));
		System.out.println(i1+"/"+i2+" = "+(i2/i1));
		System.out.println(i1+"%"+i2+" = "+(i2%i1));					// 取模(取余)
		System.out.print(i1+"++"+" = "); i1++; System.out.println(i1);	// ++与-- 写在后面,表示先参与程序的计算后自增或者自减,在这里会先输出i1,后自增
		System.out.println("++"+i1+" = " + ++i1);						// ++写在前面表示先自增,后参与输出 -- 同理
		System.out.print(i2+"-- = "); i2--; System.out.println(i2);
		System.out.println("--"+i2+" = " + --i2);
		System.out.println("i1 = " + i1);i1+=2;
		System.out.println("i1 += 2; \ni1 = " + i1);
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
		
		// 逻辑运算符
		boolean b01 = true;
		boolean b02 = false;
		System.out.println("=====逻辑运算符=====");
		System.out.println(b01&b02);	// true&false 	= false
		System.out.println(b01|b02);	// true|false 	= true
		System.out.println(!b02);		// !false 		= true
		System.out.println(b01&&b02);	// true&&false 	= false
		System.out.println(b01||b02);	// true||false 	= true
		System.out.println("=====逻辑运算符=====");
		
		// 位运算符 ^异或运算 &与运算 <<向左位移 >>向右位移 >>>无符号右移     
		System.out.println("=====位运算符=====");
		int i = 1;
		System.out.println(i>>1);
		System.out.println("=====位运算符=====");
		
		/*
		 * 	运算符优先级
		 * 	[] . ()(方法调用)										从左向右
		 * 	! ~ ++ -- +(一元运算) -(一元运算) ()(强制类型转换) new	从右向左
		 * 	* / %												从左向右
		 * 	+ -													从左向右
		 * 	<< >> >>>											从左向右
		 *  < <= > >= instanceof								从左向右
		 *  == !=												从左向右
		 *  &													从左向右
		 *  ^													从左向右
		 *  |													从左向右
		 *  &&													从左向右
		 *  ||													从左向右
		 *  ?:													从右向左
		 *  = += -= *= /= %= &= |= ^= <<= >>= >>>=				从右向左
		 */
	}

}
