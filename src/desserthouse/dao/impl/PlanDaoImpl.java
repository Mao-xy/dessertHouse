package desserthouse.dao.impl;

import java.util.ArrayList;

import org.hibernate.Session;

import desserthouse.dao.PlanDao;
import desserthouse.entity.CommodOfPlan;
import desserthouse.entity.Plan;

@SuppressWarnings("rawtypes")
public class PlanDaoImpl extends BaseDaoImpl implements PlanDao {

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Plan> getAllPlan() {
		// TODO Auto-generated method stub
	//	Session session = sessionFactory.getCurrentSession();
    //	ArrayList<Plan> list=(ArrayList<Plan>) session.createQuery("From plan order by operation_time desc").list();
		return (ArrayList<Plan>) doHqlQuery("From plan order by start_date desc");
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Plan> getPlanByStaff(long id) {
		// TODO Auto-generated method stub
		return (ArrayList<Plan>) getListByColumn(Plan.class,"staff_id",id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Plan> getPlanByStatus(int status) {
		// TODO Auto-generated method stub
		return (ArrayList<Plan>) getListByColumn(Plan.class,"status",status);
	}

	@Override
	public long add(Plan plan) {
		// TODO Auto-generated method stub
		return add(plan);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Plan plan = new Plan();
		plan.setPlan_id(id);
		//删除计划
		delete(plan);
		//删除计划对应的商品列表
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("delete from commodofplan where plan_id='"+id+"'").executeUpdate();
	}

	@Override
	public void modify(Plan plan) {
		// TODO Auto-generated method stub
		modify(plan);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<CommodOfPlan> saleable(String start_date, String end_date, long shop_id) {
		// TODO Auto-generated method stub
		String sql = "select c.* from commodofplan c,plan p where p.start_date='"+start_date+
				"' and p.end_date='"+end_date+"' and (p.shop_id='"+shop_id+"' or p.shop_id='0') and c.plan_id=p.plan_id;";
		Session session = sessionFactory.getCurrentSession();
		return (ArrayList<CommodOfPlan>) session.createSQLQuery(sql).addEntity( " commodofplan " , CommodOfPlan.class ).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<CommodOfPlan> getCommodOfPlan(long plan_id) {
		// TODO Auto-generated method stub
		return (ArrayList<CommodOfPlan>) getListByColumn(CommodOfPlan.class, "plan_id", plan_id);
	}

	@Override
	public void agreePlan(ArrayList<Long> idList) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		for(long id:idList){
			session.createSQLQuery("update plan set status='1' where plan_id='"+id+"'").executeUpdate();
		}
	}

	@Override
	public void disagreePlan(ArrayList<Long> idList) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		for(long id:idList){
			session.createSQLQuery("update plan set status='-1' where plan_id='"+id+"'").executeUpdate();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void removeCommod(long id) {
		// TODO Auto-generated method stub
		CommodOfPlan en = new CommodOfPlan();
		en.setPlanlist_id(id);
		delete(en);
	}

	@Override
	public void modifyAmount(long id, int amount) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update commodofplan set amount='"+amount+"' where planlist_id='"+id+"'").executeUpdate();
		
	}

	@Override
	public void modifyPrice(long id, double price) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("update commodofplan set price='"+price+"' where planlist_id='"+id+"'").executeUpdate();
	}
	
}
