package be.iccbxl.poo.metier;

import java.util.ArrayList;

import be.iccbxl.poo.Data;

public interface IMetier {
	public ArrayList<Data> findAll();
	
	public Data find(int nro);
	
	public ArrayList<Data> findByLevel(int level);
}
