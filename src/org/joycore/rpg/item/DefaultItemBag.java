package org.joycore.rpg.item;

import java.util.List;

/**
 * 物品容器的父类，提供了一些共用方法
 * 
 * @author eticwu
 * 
 */
public class DefaultItemBag implements ItemContainer {

	/**
	 * 目前容量
	 */
	private Integer capacity;

	/**
	 * 物品槽
	 */
	private List<ItemSlot> slots;

	@Override
	public void clearItemData() {
		for (int i = 0; i < slots.size(); i++) {
			if (slots.get(i) != null) {
				slots.get(i).clear();
			}
		}
		slots.clear();
	}

	@Override
	public Boolean isItemDataExist(Integer iid) {
		for (int i = 0; i < slots.size(); i++) {
			if (slots.get(i) != null && slots.get(i).getItemData() != null
					&& slots.get(i).getItemData().getId().equals(iid)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Integer getCapacity() {
		return this.slots.size();
	}

	@Override
	public Boolean addItemData(Integer sid, ItemData itemData, Integer num) {
		if (this.capacity > 0 && this.slots.get(sid) != null
				&& itemData != null) {
			if (this.slots.get(sid).matchType(itemData.getType())) {
				this.slots.get(sid).setItemData(itemData);
				this.slots.get(sid).setNum(num);
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean removeItemData(Integer sid, Integer num) {
		ItemSlot slot = this.slots.get(sid);
		if (slot != null && slot.getNum() >= num) {
			if (slot.getNum() == num) {
				slot.clear();
			} else {
				slot.setNum(slot.getNum() - num);
			}
			return true;
		}
		return false;
	}

	@Override
	public Boolean exchangeItemData(Integer sid1, Integer sid2) {
		ItemSlot slot1 = this.slots.get(sid1);
		ItemSlot slot2 = this.slots.get(sid2);
		if (slot1 != null && slot2 != null && slot1.matchType(slot2.getType())) {
			this.slots.set(sid1, slot2);
			this.slots.set(sid2, slot1);
			return true;
		} else {
			return false;
		}
	}

}
