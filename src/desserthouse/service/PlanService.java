package desserthouse.service;

import java.util.ArrayList;

import desserthouse.VO.CommodOfPlanVO;
import desserthouse.VO.PlanVO;

public interface PlanService {

	/*
	 * 获得所有的产品计划
	 */
	public ArrayList<PlanVO> getAllPlan();
	
	/*
	 * 获得所有该员工制定的产品计划
	 */
	public ArrayList<PlanVO> getPlanByStaff(long id);
	
	/*
	 * 获得指定状态的产品计划
	 */
	public ArrayList<PlanVO> getPlanByStatus(int status);
	
	public long add(PlanVO vo);
	
	public void delete(long id);
	
	public void modify(PlanVO vo);
	
	/*
	 * 获得该产品计划中的产品列表
	 */
	public ArrayList<CommodOfPlanVO> getCommodOfPlan(long plan_id);
	
	/*
	 * 增加产品计划的商品，返回所有增加的商品列表的id
	 */
	public ArrayList<String> addCommodOfPlan(ArrayList<CommodOfPlanVO> list);
	
	/*
	 * 修改一个产品计划中的产品
	 */
	public void modifyCommodOfPlan(CommodOfPlanVO vo);
	
	/*
	 * 根据id删除commodOfPlan
	 */
	public void deleteCommodOfPlan(long id);
	
	/*
	 * 根据plan_id删除该计划的所有产品
	 */
	public void deleteByPlan(long plan_id);
	
	/*
	 * 获得某个店面在某周的所有可销售产品
	 */
	public ArrayList<CommodOfPlanVO> saleable(String date, long id);
}
