package be.iccbxl.poo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

import be.iccbxl.poo.Data;

public class DaoList implements IDao {
	//Données membres
	ArrayList<Data> list;
	
	public DaoList() {
		super();
		this.list = new ArrayList<>();
		
		this.list.add(new Data("Salutation", 1, true));
		this.list.add(new Data("Bien le bonjour!", 3, false));
		this.list.add(new Data("Ciao!", 2, true));
		this.list.add(new Data("Au revoir!", 3, true));
	}

	@Override
	public ArrayList<Data> findAll() {
		return list;
	}

	@Override
	public Data find(int nro) {		
		return list.get(nro);
	}

	@Override
	public ArrayList<Data> findByLevel(int level) {
		ArrayList<Data> result = new ArrayList<>();
		
		Iterator<Data> it = list.iterator();
		
		while(it.hasNext()) {
			Data d = it.next();
			
			if(d.getLevel() == level) {
				result.add(d);
			}
		}
		
		return result;
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
