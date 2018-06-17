package com.luo.strategy;

/**
 * 父类，所有鸭子都要继承此类
 * @author 罗正朝
 *
 */
public abstract class Duck {
	
	/**
	 * 鸭子发出叫声：通用方法
	 */
	public void quack() {
		System.out.println("嘎嘎嘎");
	}
	
	/**
	 * 鸭子的外观：各不相同，有子类实现
	 */
	public abstract void display();
	
	/**
	 * 鸭子的行为：策略模式实现
	 */
	private FlyingStrategy flyingStrategy;

	public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}
	
	public void fly() {
		flyingStrategy.prefly();;
	}
	
}
