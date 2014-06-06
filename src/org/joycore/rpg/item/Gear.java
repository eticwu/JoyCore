package org.joycore.rpg.item;

import org.joycore.rpg.effect.GearEffect;

/**
 * 装备
 * @author eticwu
 *
 */
public class Gear extends Item<GearEffect> {

	/**
	 * 基础攻击力
	 */
	private Integer damage;
	
	/**
	 * 基础防御力
	 */
	private Integer defence;
	
	/**
	 * 力量，武力等，附加属性，加成在基础攻击力上
	 */
	private Integer strength;
	
	/**
	 * 智力，谋略等，作用在魔法和法术的成功率和效果上
	 */
	private Integer intellect;
	
	@Override
	public void use() {
		
	}
	
	@Override
	public void takeEffect(GearEffect e) {
		this.damage += e.getDamageUpgrade();
		this.defence += e.getDefenceUpgrade();
		this.strength += e.getStrengthUpgrade();
		this.intellect += e.getIntellectUpgrade();
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Integer getDefence() {
		return defence;
	}

	public void setDefence(Integer defence) {
		this.defence = defence;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getIntellect() {
		return intellect;
	}

	public void setIntellect(Integer intellect) {
		this.intellect = intellect;
	}
	
	public static void main(String[] args) {
		Gear gear = new Gear();
		gear.getEffects();
	}

	
}
