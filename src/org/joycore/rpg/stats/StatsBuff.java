package org.joycore.rpg.stats;

import org.joycore.rpg.object.StatsObject;

/**
 * 一组属性加成，BUFF或DEBUFF
 * 
 * @author eticwu
 *
 */
public class StatsBuff extends StatsObject{

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
