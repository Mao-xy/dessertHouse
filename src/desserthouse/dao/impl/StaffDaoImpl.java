package desserthouse.dao.impl;

import java.util.ArrayList;

import org.hibernate.Session;

import desserthouse.configure.Configure;
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
		long id = super.add(staff);
		int size = String.valueOf(id).length();
		String staff_id = "";
		for(int i=size;i<=4;i++){
			staff_id = "0" + id;
		}
		if(staff.getPost()==Configure.ADMIN){
			staff_id = "ADM"+staff_id;
		}else if(staff.getPost()==Configure.MANAGER){
			staff_id = "MAN"+staff_id;
		}else if(staff.getPost()==Configure.MAIN_SERVER){
			staff_id = "MSR"+staff_id;
		}else if(staff.getPost()==Configure.SALES){
			staff_id = "SER"+staff_id;
		}
		staff.setStaff_id(staff_id);
		System.out.println("staff_id:"+staff_id);
		super.update(staff);
		return id;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(Staff staff) {
		// TODO Auto-generated method stub
		super.update(staff);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Staff s = new Staff();
		s.setId(id);
		super.delete(s);
	}

	@Override
	public void modifyName(long id, String value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update staff set name='"+value+"' where id='"+id+"'").executeUpdate();
	}

	@Override
	public void modifyPhone(long id, String value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update staff set phone='"+value+"' where id='"+id+"'").executeUpdate();
	}

	@Override
	public void modifyCard(long id, String value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update staff set card='"+value+"' where id='"+id+"'").executeUpdate();
	}

	@Override
	public void modifySalary(long id, double value) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update staff set salary='"+value+"' where id='"+id+"'").executeUpdate();
	}

}
