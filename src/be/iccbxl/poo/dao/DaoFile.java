package be.iccbxl.poo.dao;

import java.util.ArrayList;
import java.util.regex.Pattern;

import be.iccbxl.poo.Data;

public class DaoFile implements IDao {
	//Données membres
	private String filename;
	private ArrayList<Data> list;

	//TODO définir le constructeur
	//Lire les données du fichier et les charger dans list
	
	@Override
	public ArrayList<Data> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data find(int nro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Data> findByLevel(int level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Data> findDataByInfo(Pattern regex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Data data, String info, int level, boolean free) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Data data, String info, int level) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateInfo(Data data, String info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLevel(Data data, int level) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Data data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int nro) {
		// TODO Auto-generated method stub

	}

	@Override
	public int deleteAll(boolean free) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean insert(Data data) {
		// TODO Auto-generated method stub
		return false;
	}

}
