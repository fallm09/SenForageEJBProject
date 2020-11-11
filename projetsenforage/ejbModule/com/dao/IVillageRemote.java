package com.dao;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Village;

@Remote
public interface IVillageRemote {
	public List<Village> liste ();
	public int add (Village village);

}
