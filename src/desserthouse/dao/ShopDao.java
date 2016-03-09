package desserthouse.dao;

import java.util.ArrayList;

import desserthouse.entity.Shop;

public interface ShopDao {
	
	public Shop getById(long id);
	
	public ArrayList<Shop> getAllShop();
	
	public ArrayList<Shop> getShopByPage(int page, int size);
	
	public long add(Shop shop);
	
	public void delete(long id);
	
	public void modify(Shop shop);
}
