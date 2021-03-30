package be.iccbxl.poo.metier;

import java.util.ArrayList;

import be.iccbxl.poo.Data;
import be.iccbxl.poo.dao.DaoList;
import be.iccbxl.poo.dao.IDao;

public class Metier implements IMetier {
	
	private IDao dao = new DaoList();

	@Override
	public ArrayList<Data> findAll() {
		return dao.findAll();
	}

	@Override
	public Data find(int nro) {
		return dao.find(nro);
	}

	@Override
	public ArrayList<Data> findByLevel(int level) {
		return dao.findByLevel(level);
	}

}
