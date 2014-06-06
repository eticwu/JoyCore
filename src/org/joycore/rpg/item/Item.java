package org.joycore.rpg.item;

import java.util.ArrayList;
import java.util.List;

import org.joycore.rpg.effect.Effect;

/**
 * 所有物品的抽象类，有一些公共属性
 * 
 * @author eticwu
 *
 */
public abstract class Item<T extends Effect> {

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
	 * 物品的效果
	 */
	private List<T> effects = new ArrayList<T>();
	
	/**
	 * 使用物品，由具体的子类去实现
	 */
	public abstract void use();
	
	/**
	 * 使所有效果对物品生效
	 */
	public void takeAllEffect() {
		for(T e : effects){
			this.takeEffect(e);
		}
	}
	
	/**
	 * 使e效果对物品生效，由具体的子类去实现
	 */
	public abstract void takeEffect(T e);
	
	/**
	 * 增加效果并对物品生效
	 */
	public void addEffect(T e){
		this.effects.add(e);
		this.takeEffect(e);
	}
	
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

	public List<T> getEffects() {
		return effects;
	}

	public void setEffects(List<T> effects) {
		this.effects = effects;
	}

}
