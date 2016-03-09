package desserthouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.StaffVO;
import desserthouse.dao.StaffDao;
import desserthouse.entity.Staff;
import desserthouse.service.StaffService;
import desserthouse.util.Transform;

public class StaffServiceImpl implements  StaffService {

	@Autowired
	StaffDao sd;
	@Override
	public StaffVO login(String id, String password) {
		// TODO Auto-generated method stub
		Staff st = sd.login(id, password);
		if(st!=null){
			return Transform.staff2VO(st);
		}
		else{
			return null;
		}
	}
	@Override
	public StaffVO getStaffById(long id) {
		// TODO Auto-generated method stub
		return Transform.staff2VO(sd.getStaffById(id));
	}

}
