package com.luo.strategy;

import com.luo.strategy.impl.FlyWithWin;

/**
 * 策略模式实现：大黄鸭飞行行为
 * @author 罗正朝
 *
 */
public class BigDuck extends Duck {

	
	
	public BigDuck() {
		super();
		super.setFlyingStrategy(new FlyWithWin());//策略模式选择飞行方法
	}

	@Override
	public void display() {
		System.out.println("黄色的");
	}

}
