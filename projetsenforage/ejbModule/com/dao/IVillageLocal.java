package com.dao;

import java.util.List;

import javax.ejb.Local;

import com.entities.Village;

@Local

public interface IVillageLocal {
	public List<Village> liste();
	public int add (Village village);
	public Village getVillage(int village_id);
	

}
