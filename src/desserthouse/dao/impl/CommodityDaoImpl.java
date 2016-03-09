package desserthouse.dao.impl;

import java.util.ArrayList;

import desserthouse.dao.CommodityDao;
import desserthouse.entity.Commodity;

@SuppressWarnings("rawtypes")
public class CommodityDaoImpl extends BaseDaoImpl implements CommodityDao {

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Commodity> getAllCommod() {
		// TODO Auto-generated method stub
		return (ArrayList<Commodity> )getAll(Commodity.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Commodity> getCommodByPage(int page, int size) {
		// TODO Auto-generated method stub
		return (ArrayList<Commodity>) getAllByPage(Commodity.class, page, size);
	}

	@Override
	public Commodity getById(long id) {
		// TODO Auto-generated method stub
		return (Commodity) getById(Commodity.class,id);
	}

}
