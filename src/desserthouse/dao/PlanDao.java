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
	
	/*
	 * 获得该计划的商品列表
	 */
	public ArrayList<CommodOfPlan> getCommodOfPlan(long plan_id);
	/*
	 * 审批通过一批计划
	 */
	public void agreePlan(ArrayList<Long> idList);
	/*
	 * 审批驳回一批计划
	 */
	public void disagreePlan(ArrayList<Long> idList);
	/*
	 * 移除计划中的某个商品
	 */
	public void removeCommod(long id);
	/*
	 * 修改计划中的某个商品的商品数量
	 */
	public void modifyAmount(long id, int amount);
	/*
	 * 修改计划中的某个商品的商品单价
	 */
	public void modifyPrice(long id, double price);
}
