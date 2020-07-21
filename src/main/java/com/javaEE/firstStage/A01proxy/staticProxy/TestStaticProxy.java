package com.javaEE.firstStage.A01proxy.staticProxy;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		// 初始化哈佛车辆厂商,不然代理卖什么.
		HaFo hf = new HaFo();
		// 初始化五菱宏光车辆厂商,不然代理卖什么.
		WuLingHongGuang wlhg = new WuLingHongGuang();
		
		// 实例化4s店(代理)
		ShangHai4sShop sh4s1 = new ShangHai4sShop(hf);
		//ShangHai4sShop sh4s2 = new ShangHai4sShop(wlhg);
		HangZhou4sProxy hz4s1 = new HangZhou4sProxy(wlhg);
		
		sh4s1.sell();
		//sh4s2.sell();
		hz4s1.sell();
		
		
	}

}
