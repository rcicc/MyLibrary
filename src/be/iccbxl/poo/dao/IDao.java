package be.iccbxl.poo.dao;

import java.util.ArrayList;
import java.util.regex.Pattern;

import be.iccbxl.poo.Data;

public interface IDao {
	//Annoncer Create Read Update Delete
	
	public ArrayList<Data> findAll();
	
	public Data find(int nro);
	
	public ArrayList<Data> findByLevel(int level);
	
	public ArrayList<Data> findDataByInfo(Pattern regex);
	
	public void update(Data data, String info, int level, boolean free);
	
	public void update(Data data, String info, int level);
	
	public void updateInfo(Data data, String info);
	
	public void updateLevel(Data data, int level);
	
	public void delete(Data data);
	
	public void delete(int nro);
	
	public int deleteAll(boolean free);
		
	public boolean insert(Data data);
}
