package com.javaEE.firstStage.A01proxy.staticProxy;

/**
 *	上海某家4s店, 当前即为代理,代理N多车商, 对N多品牌的车进行代理售卖, 自然应该有N多构造方法.
 * @author SuperInteface
 *
 */
public class ShangHai4sShop implements Commodity{
	
	private Commodity commodity;
	
	// 对五菱宏光进行代理构造方法
	public ShangHai4sShop(WuLingHongGuang wlhg) {
		this.commodity = wlhg;
	}
	// 对哈佛进行代理构造方法
	public ShangHai4sShop(HaFo hafo) {
		this.commodity = hafo;
	}
	
	@Override
	public void sell() {
		// 代理主要对业务进行增强,比如,当前对车进行代理售卖,保持原有出售车辆业务基础上,增加打折,加价购等活动.
		System.out.println("== 当前代理为: " + this.getClass().getName());
		this.commodity.sell();
		System.out.println("== 现在购买可参加活动: +200赠送一份商业人身意外保险一份(3年期), 机不可失失不再来.");
	}

}
