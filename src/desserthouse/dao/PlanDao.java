package desserthouse.dao;

import java.util.ArrayList;

import desserthouse.entity.CommodOfPlan;
import desserthouse.entity.Plan;

public interface PlanDao {
	
	
	public ArrayList<Plan> getAllPlan();

	public ArrayList<Plan> getPlanByStaff(long id);

	public ArrayList<Plan> getPlanByStatus(int status);
	
	public long add(Plan plan);
	
	public void delete(long id);
	
	public void modify(Plan plan);
	
	/*
	 * 获得该时间段内所有可出售的商品
	 */
	public ArrayList<CommodOfPlan> saleable(String start_date,String end_date, long shop_id);
	
	public ArrayList<CommodOfPlan> getCommodOfPlan(long plan_id);
}
