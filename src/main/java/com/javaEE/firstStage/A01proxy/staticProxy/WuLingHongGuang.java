package com.javaEE.firstStage.A01proxy.staticProxy;

/**
 *	五菱宏光商品厂商,可以出售五菱宏光系列商品.
 *	@author SuperInteface
 */
public class WuLingHongGuang implements Commodity{

	@Override
	public void sell() {
		System.out.println("== 当前售卖的商品为: 五菱宏光系列 ==");
	}

}
