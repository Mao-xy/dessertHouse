package desserthouse.dao;

import desserthouse.entity.Staff;

public interface StaffDao {
	
	public Staff login(String staff_id, String password);
	
	public Staff getStaffById(long id);

}
