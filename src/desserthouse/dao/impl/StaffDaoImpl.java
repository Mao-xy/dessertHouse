package desserthouse.dao.impl;

import java.util.ArrayList;

import desserthouse.dao.StaffDao;
import desserthouse.entity.Staff;

@SuppressWarnings("rawtypes")
public class StaffDaoImpl extends BaseDaoImpl implements StaffDao {

	@Override
	public Staff login(String staff_id, String password) {
		// TODO Auto-generated method stub
		Staff staff = (Staff) getByColumn(Staff.class, "staff_id", staff_id);
		if(staff.getPassword().equals(password)){
			return staff;
		}
		return null;
	}

	@Override
	public Staff getStaffById(long id) {
		// TODO Auto-generated method stub
		return (Staff) getById(Staff.class,id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Staff> getStaffOfShop(long shop_id) {
		// TODO Auto-generated method stub
		return (ArrayList<Staff>) getListByColumn(Staff.class,"shop_id",shop_id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Staff> getAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Staff>) getAll(Staff.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public long add(Staff staff) {
		// TODO Auto-generated method stub
		return super.add(staff);
	}

}
