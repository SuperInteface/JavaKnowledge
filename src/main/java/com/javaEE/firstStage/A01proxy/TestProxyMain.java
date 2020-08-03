package com.javaEE.firstStage.A01proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.javaEE.firstStage.A01proxy.dynamicProxy.ProxyHandler;
import com.javaEE.firstStage.A01proxy.staticProxy.HangZhou4sShopProxy;
import com.javaEE.firstStage.A01proxy.staticProxy.ShangHai4sShopProxy;

public class TestProxyMain {
	
	public static void main(String[] args) {
		/*
		// 静态代理
		// 初始化哈佛车辆厂商,不然代理卖什么.
		HaFo hf = new HaFo();
		// 初始化五菱宏光车辆厂商,不然代理卖什么.
		WuLingHongGuang wlhg = new WuLingHongGuang();
		
		// 实例化4s店(代理)
		ShangHai4sShopProxy sh4s1 = new ShangHai4sShopProxy(hf);
		//ShangHai4sShop sh4s2 = new ShangHai4sShop(wlhg);
		HangZhou4sShopProxy hz4s1 = new HangZhou4sShopProxy(wlhg);
		
		sh4s1.sell();
		//sh4s2.sell();
		hz4s1.sell();
		*/
		
		// 动态代理
		//System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Commodity com = new HaFo();
		InvocationHandler handler = new ProxyHandler(com);
		Commodity proxyCom =  (Commodity) Proxy.newProxyInstance(com.getClass().getClassLoader(), com.getClass().getInterfaces(), handler);
		proxyCom.sell();
		
	}

}
