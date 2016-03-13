package desserthouse.dao;

import java.util.ArrayList;

import desserthouse.entity.Staff;

public interface StaffDao {
	
	public Staff login(String staff_id, String password);
	
	public Staff getStaffById(long id);
	
	/*
	 * 获得该店面的所有职工
	 */
	public ArrayList<Staff> getStaffOfShop(long shop_id);
	/*
	 * 获得所有的职工
	 */
	public ArrayList<Staff> getAll();
	/*
	 * 添加一个员工 
	 */
	public long add(Staff staff);
	
	public void update(Staff staff);
	
	public void delete(long id);
	
	public void modifyName(long id, String value);
	
	public void modifyPhone(long id, String value);
	
	public void modifyCard(long id, String value);
	
	public void modifySalary(long id, double value);
}
