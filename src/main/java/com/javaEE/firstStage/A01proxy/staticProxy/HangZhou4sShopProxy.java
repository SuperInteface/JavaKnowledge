package com.javaEE.firstStage.A01proxy.staticProxy;

import com.javaEE.firstStage.A01proxy.Commodity;
import com.javaEE.firstStage.A01proxy.HaFo;
import com.javaEE.firstStage.A01proxy.WuLingHongGuang;

public class HangZhou4sShopProxy implements Commodity{

	private Commodity commodity;
	
	public HangZhou4sShopProxy (HaFo hf){
		this.commodity = hf;
	}
	
	public HangZhou4sShopProxy (WuLingHongGuang wlhg){
		this.commodity = wlhg;
	}
	
	@Override
	public void sell() {
		System.out.println("== 当前代理为: " + this.getClass().getName());
		this.commodity.sell();
		System.out.println("== 当前购车可参加活动: +100 赠送西湖三日游活动.");
	}

}
