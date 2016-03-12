package desserthouse.dao.impl;

import java.util.ArrayList;

import org.hibernate.Session;

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

	@SuppressWarnings("unchecked")
	@Override
	public long add(Shop shop) {
		// TODO Auto-generated method stub
		return super.add(shop);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.setShop_id(id);
		delete(shop);
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update staff set shop_id='-1' where shop_id='"+id+"'").executeUpdate();
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

	@Override
	public String getName(long id) {
		// TODO Auto-generated method stub
		Shop vo = (Shop) getById(Shop.class,id);
		return vo.getName();
	}

	@Override
	public void modifyName(long id, String value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update shop set name='"+value+"' where shop_id='"+id+"'").executeUpdate();
	}

	@Override
	public void modifyAddress(long id, String value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update shop set address='"+value+"' where shop_id='"+id+"'").executeUpdate();
	}

	@Override
	public void modifyOwner(long id, String value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update shop set owner='"+value+"' where shop_id='"+id+"'").executeUpdate();
	}

	@Override
	public void modifyPhone(long id, String value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update shop set phone='"+value+"' where shop_id='"+id+"'").executeUpdate();
	}


}
