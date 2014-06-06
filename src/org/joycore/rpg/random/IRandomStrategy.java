package org.joycore.rpg.random;

/**
 * 随机数策略接口
 * 
 * @author eticwu
 *
 */
public interface IRandomStrategy {

	/**
	 * 根据几率，随机策略决定是否发生
	 * @param rate 几率，单位%
	 * @return
	 */
	public boolean happen(Integer rate);
}
