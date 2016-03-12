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
