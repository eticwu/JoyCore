package org.joycore.rpg.item;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.joycore.rpg.object.ItemObject;

/**
 * 物品管理器，包括创建，初始化，保存
 * 
 * @author eticwu
 *
 */
public class ItemManager {

	/**
	 * 所用物品的全集
	 */
	private static Map<Integer, ItemObject> allItems = new HashMap<Integer, ItemObject>();
	
	/**
	 * 装备栏类型
	 */
	private static Set<Integer> gearType = new HashSet<Integer>();
	
	public void init() {

	}

	public void produce() {

	}

	public void save() {

	}
	
	public void destroy() {
		
	}

	public static ItemObject find(Integer id) {
		if (allItems.containsKey(id)) {
			return allItems.get(id);
		}
		return null;
	}

	public static Map<Integer, ItemObject> getAllItems() {
		return allItems;
	}

	public static Set<Integer> getGearType() {
		return gearType;
	}
	
}