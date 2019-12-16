package com.example.APIs;

import java.util.HashMap;
import java.util.Map;

public class Stats {

	private String hp;
	private String attack;
	private String defense;
	private String sp_atk;
	private String sp_def;
	private String speed;
	private String total;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	public String getDefense() {
		return defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
	}

	public String getSp_atk() {
		return sp_atk;
	}

	public void setSp_atk(String sp_atk) {
		this.sp_atk = sp_atk;
	}

	public String getSp_def() {
		return sp_def;
	}

	public void setSp_def(String sp_def) {
		this.sp_def = sp_def;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
