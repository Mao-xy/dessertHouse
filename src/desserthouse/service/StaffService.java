package desserthouse.service;

import desserthouse.VO.StaffVO;

public interface StaffService {
	
	public StaffVO login(String staff_id, String password);
	
	public StaffVO getStaffById(long id);

}
