package desserthouse.dao;

import java.util.ArrayList;

import desserthouse.entity.Commodity;

public interface CommodityDao {
	
	public ArrayList<Commodity> getAllCommod();
	
	public ArrayList<Commodity> getCommodByPage(int page, int size);
	
	public Commodity getById(long id);

}
