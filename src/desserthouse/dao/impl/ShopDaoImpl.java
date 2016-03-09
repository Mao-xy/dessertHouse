package desserthouse.dao.impl;

import java.util.ArrayList;

import desserthouse.dao.ShopDao;
import desserthouse.entity.Shop;

@SuppressWarnings("rawtypes")
public class ShopDaoImpl extends BaseDaoImpl implements ShopDao {

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Shop> getAllShop() {
		// TODO Auto-generated method stub
		return (ArrayList<Shop>)getAll(Shop.class);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Shop> getShopByPage(int page, int size){
		return (ArrayList<Shop>)getAllByPage(Shop.class,page,size);
	}

	@Override
	public long add(Shop shop) {
		// TODO Auto-generated method stub
		return add(shop);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.setShop_id(id);
		delete(shop);
	}

	@Override
	public void modify(Shop shop) {
		// TODO Auto-generated method stub
		modify(shop);
	}

	@Override
	public Shop getById(long id) {
		// TODO Auto-generated method stub
		return (Shop) getById(Shop.class,id);
	}


}
