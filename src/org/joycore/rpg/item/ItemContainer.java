package org.joycore.rpg.item;


/**
 * 物品容器的接口
 * @author eticwu
 *
 */
public interface ItemContainer {
	
	/**
	 * 获取容器的容量
	 */
	public Integer getCapacity();
	
	/**
	 * 在某个位置增加物品
	 * @param sid
	 * @param itemData
	 * @param num
	 * @return
	 */
	public Boolean addItemData(Integer sid, ItemData itemData, Integer num);
	
	/**
	 * 去除某个位置的物品
	 * @param sid
	 * @param num
	 */
	public Boolean removeItemData(Integer sid, Integer num);
	
	/**
	 * 将两个位置上的物品交换
	 * @param sid1
	 * @param sid2
	 * @return
	 */
	public Boolean exchangeItemData(Integer sid1, Integer sid2);
	
	/**
	 * @return
	 */
	public void clearItemData();
	
	/**
	 * 查询物品数据是不是存在
	 * @param iid
	 * @return
	 */
	public Boolean isItemDataExist(Integer iid);
}
