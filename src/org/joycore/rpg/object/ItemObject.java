package org.joycore.rpg.object;

public class ItemObject extends StatsObject {
	
	/**
	 * 物品id
	 */
	private Integer Id;
	
	/**
	 * 物品名称
	 */
	private String name;
	
	/**
	 * 物品说明
	 */
	private String desc;
	
	/**
	 * 物品类型
	 */
	private Integer type;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
