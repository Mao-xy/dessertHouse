package desserthouse.dao.impl;

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

}
