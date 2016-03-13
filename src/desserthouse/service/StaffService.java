package desserthouse.service;

import java.util.ArrayList;

import desserthouse.VO.StaffVO;

public interface StaffService {
	
	public StaffVO login(String staff_id, String password);
	
	public StaffVO getStaffById(long id);
	
	/*
	 * 获得该店面的所有职工
	 */
	public ArrayList<StaffVO> staffOfShop(long shop_id);
	
	/*
	 * 获得所有的职工
	 */
	public ArrayList<StaffVO> getAll();
	/*
	 * 
	 */
	public long add(StaffVO vo);
	
	public void update(StaffVO vo);
	
	public void delete(long id);
	
	public void modifyName(long id, String value);
	
	public void modifyPhone(long id, String value);
	
	public void modifyCard(long id, String value);
	
	public void modifySalary(long id, double value);
	

}
