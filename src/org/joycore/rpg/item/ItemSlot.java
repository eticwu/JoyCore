package org.joycore.rpg.item;

/**
 * 物品容器的每一个槽
 * 
 * @author eticwu
 * 
 */
public class ItemSlot {

	/**
	 * slot类型，与物品类型对应，限制存放的物品类型
	 */
	private Integer type;

	/**
	 * item的数量
	 */
	private Integer num;

	/**
	 * itemData
	 */
	private ItemData itemData;

	/**
	 * 清楚slot
	 */
	public void clear() {
		this.num = 0;
		this.itemData = null;
	}

	public Boolean matchType(Integer type) {
		if (type == null) {
			return false;
		}
		return this.type.equals(type);
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public ItemData getItemData() {
		return itemData;
	}

	public void setItemData(ItemData itemData) {
		this.itemData = itemData;
	}

}
