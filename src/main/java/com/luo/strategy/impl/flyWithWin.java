package com.luo.strategy.impl;

import com.luo.strategy.FlyingStrategy;

public class flyWithWin implements FlyingStrategy {

	@Override
	public void prefly() {
		System.out.println("火箭般飞翔");

	}

}
