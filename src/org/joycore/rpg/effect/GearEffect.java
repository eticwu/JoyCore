package org.joycore.rpg.effect;

/**
 * 装备的效果
 * @author eticwu
 *
 */
public class GearEffect extends Effect {
	
	/**
	 * 基础攻击加成
	 */
	private Integer damageUpgrade;

	/**
	 * 基础防御加成
	 */
	private Integer defenceUpgrade;
	
	/**
	 * 力量加成
	 */
	private Integer strengthUpgrade;

	/**
	 * 智力加成
	 */
	private Integer intellectUpgrade;

	public Integer getDamageUpgrade() {
		return damageUpgrade;
	}

	public void setDamageUpgrade(Integer damageUpgrade) {
		this.damageUpgrade = damageUpgrade;
	}

	public Integer getDefenceUpgrade() {
		return defenceUpgrade;
	}

	public void setDefenceUpgrade(Integer defenceUpgrade) {
		this.defenceUpgrade = defenceUpgrade;
	}

	public Integer getStrengthUpgrade() {
		return strengthUpgrade;
	}

	public void setStrengthUpgrade(Integer strengthUpgrade) {
		this.strengthUpgrade = strengthUpgrade;
	}

	public Integer getIntellectUpgrade() {
		return intellectUpgrade;
	}

	public void setIntellectUpgrade(Integer intellectUpgrade) {
		this.intellectUpgrade = intellectUpgrade;
	}
}
