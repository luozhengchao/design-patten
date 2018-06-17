package com.luo.strategy;

import com.luo.strategy.impl.FlyWithWin;

/**
 * 策略模式测试：鸭子的飞行行为用策略模式实现
 * @author 罗正朝
 *
 */
public class DuckTest {
	public static void main(String[] args) {
		BigDuck duck = new BigDuck();
		duck.quack();//叫：直接继承
		duck.display();//颜色：重写父类的方法	
		duck.fly();//飞行：策略模式实现
	}
}
