package desserthouse.service.impl;

import java.util.ArrayList;

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
	@Override
	public ArrayList<StaffVO> staffOfShop(long shop_id) {
		// TODO Auto-generated method stub
		return Transform.staffList2vo(sd.getStaffOfShop(shop_id));
	}
	@Override
	public ArrayList<StaffVO> getAll() {
		// TODO Auto-generated method stub
		return Transform.staffList2vo(sd.getAll());
	}
	@Override
	public long add(StaffVO vo) {
		// TODO Auto-generated method stub
		return sd.add(Transform.vo2staff(vo));
	}
	@Override
	public void update(StaffVO vo) {
		// TODO Auto-generated method stub
		sd.update(Transform.vo2staff(vo));
	}
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		sd.delete(id);
	}
	@Override
	public void modifyName(long id, String value) {
		// TODO Auto-generated method stub
		sd.modifyName(id, value);
	}
	@Override
	public void modifyPhone(long id, String value) {
		// TODO Auto-generated method stub
		sd.modifyPhone(id, value);
	}
	@Override
	public void modifyCard(long id, String value) {
		// TODO Auto-generated method stub
		sd.modifyCard(id, value);
	}
	@Override
	public void modifySalary(long id, double value) {
		// TODO Auto-generated method stub
		sd.modifySalary(id, value);
	}

}
