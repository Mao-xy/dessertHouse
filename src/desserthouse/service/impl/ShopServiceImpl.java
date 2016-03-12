package desserthouse.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.ShopVO;
import desserthouse.dao.ShopDao;
import desserthouse.service.ShopService;
import desserthouse.util.Transform;

public class ShopServiceImpl implements ShopService{

	@Autowired
	ShopDao sd;
	@Override
	public ArrayList<ShopVO> getAll() {
		// TODO Auto-generated method stub
		return Transform.shopList2VO(sd.getAllShop());
	}
	@Override
	public ArrayList<ShopVO> getByPage(int page, int size) {
		// TODO Auto-generated method stub
		return Transform.shopList2VO(sd.getShopByPage(page,size));
	}
	@Override
	public long add(ShopVO vo) {
		// TODO Auto-generated method stub
		return sd.add(Transform.vo2shop(vo));
	}
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		sd.delete(id);
	}
	@Override
	public void modify(ShopVO vo) {
		// TODO Auto-generated method stub
		sd.modify(Transform.vo2shop(vo));
	}
	@Override
	public ShopVO getById(long id) {
		// TODO Auto-generated method stub
		return Transform.shop2vo(sd.getById(id));
	}
	@Override
	public String getName(long id) {
		// TODO Auto-generated method stub
		return sd.getName(id);
	}
	@Override
	public void modifyName(long id, String value) {
		// TODO Auto-generated method stub
		sd.modifyName(id, value);
	}
	@Override
	public void modifyAddress(long id, String value) {
		// TODO Auto-generated method stub
		sd.modifyAddress(id, value);
	}
	@Override
	public void modifyOwner(long id, String value) {
		// TODO Auto-generated method stub
		sd.modifyOwner(id, value);
	}
	@Override
	public void modifyPhone(long id, String value) {
		// TODO Auto-generated method stub
		sd.modifyPhone(id, value);
	}

}
