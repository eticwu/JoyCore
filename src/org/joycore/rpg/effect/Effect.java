package org.joycore.rpg.effect;

/**
 * 物品，法术，打斗等的效果
 * 
 * @author eticwu
 *
 */
public class Effect {
	
	/**
	 * 效果名称
	 */
	private String name;
	
	/**
	 * 效果id
	 */
	private Integer id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
