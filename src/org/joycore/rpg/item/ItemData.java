package org.joycore.rpg.item;

import java.util.HashMap;
import java.util.Map;

import org.joycore.rpg.object.ItemObject;
import org.joycore.rpg.stats.StatsBuff;

/**
 * 所有物品的抽象类，有一些公共属性
 * 
 * @author eticwu
 *
 */
public abstract class ItemData extends ItemObject{

	/**
	 * 物品id
	 */
	private Integer id;
	
	/**
	 * 属性BUFF
	 */
	private Map<Integer, StatsBuff> statsBuffMap = new HashMap<Integer, StatsBuff>();
	
	/**
	 * 为物品添加某个属性
	 * 
	 * @param s
	 */
	public void addStatsValue(StatsBuff s){
		if (s != null) {
			statsBuffMap.put(s.getId(), s);	
		}
	}
	
	/**
	 * 移除物品某个buff
	 * 
	 * @param s
	 */
	public void removeStatsValue(Integer i){
		if (statsBuffMap.containsKey(i)) {
			statsBuffMap.remove(i);
		}
	}
	
	/**
	 * 获取某个buff
	 * 
	 * @param i
	 * @return
	 */
	public StatsBuff getStatsValue(Integer i){
		return statsBuffMap.get(i);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Map<Integer, StatsBuff> getStatsBuffMap() {
		return statsBuffMap;
	}

	public void setStatsBuffMap(Map<Integer, StatsBuff> statsBuffMap) {
		this.statsBuffMap = statsBuffMap;
	}

}
