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
	
	/*
	 * 通过id获得店面名称
	 */
	public String getName(long id);
	/*
	 * 修改改店面的名称
	 */
	public void modifyName(long id, String value);
	/*
	 * 修改改店面的地址
	 */
	public void modifyAddress(long id, String value);
	/*
	 * 修改改店面的店长
	 */
	public void modifyOwner(long id, String value);
	/*
	 * 修改改店面的联系方式
	 */
	public void modifyPhone(long id, String value);
}
