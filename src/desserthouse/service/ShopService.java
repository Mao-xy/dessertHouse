package desserthouse.service;

import java.util.ArrayList;

import desserthouse.VO.ShopVO;

public interface ShopService {
	
	public ShopVO getById(long id);
	
	public ArrayList<ShopVO> getAll();
	
	public ArrayList<ShopVO> getByPage(int page, int size);

	public long add(ShopVO vo);
	
	public void delete(long id);
	
	public void modify(ShopVO vo);
	
}
