package com.javaEE.firstStage.A01proxy.staticProxy;

public class HangZhou4sProxy implements Commodity{

	private Commodity commodity;
	
	public HangZhou4sProxy (HaFo hf){
		this.commodity = hf;
	}
	
	public HangZhou4sProxy (WuLingHongGuang wlhg){
		this.commodity = wlhg;
	}
	
	@Override
	public void sell() {
		System.out.println("== 当前代理为: " + this.getClass().getName());
		this.commodity.sell();
		System.out.println("== 当前购车可参加活动: +100 赠送西湖三日游活动.");
	}

}
