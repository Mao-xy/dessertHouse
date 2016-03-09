package desserthouse.controller.api;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.CommodOfPlanVO;
import desserthouse.VO.CommodityVO;
import desserthouse.VO.PlanVO;
import desserthouse.VO.ShopVO;
import desserthouse.configure.Configure;
import desserthouse.controller.BaseController;
import desserthouse.service.CommodityService;
import desserthouse.service.PlanService;

public class PlanJsonController extends BaseController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	PlanService ps;
	@Autowired
	CommodityService cs;
	
	private ArrayList<PlanVO> planList;
	private long plan_id;
	private ArrayList<CommodOfPlanVO> commodOfPlan;
	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String allPlan(){
		planList=ps.getAllPlan();
		return Configure.SUCCESS;
	}
	
	public String planByStaff(){
		long id = Long.parseLong(getParams().get("staff_id"));
		planList=ps.getPlanByStaff(id);
		return Configure.SUCCESS;
	}
	
	public String planByStatus(){
		int status = Integer.parseInt(getParams().get("status"));
		planList=ps.getPlanByStatus(status);
		return Configure.SUCCESS;
	}
	
	public String addPlan(){
		Map<String, String> params = getParams();
		String start = params.get("start");
		String end = params.get("end");
		long staff = Long.parseLong(params.get("staff"));
		String operation_time = params.get("time");
		int status = Integer.parseInt(params.get("status"));
		PlanVO vo = new PlanVO();
		vo.setStart_date(start);
		vo.setEnd_date(end);
		vo.setStaff_id(staff);
		vo.setOperation_time(operation_time);
		vo.setStatus(status);
		plan_id = ps.add(vo);
		ArrayList<PlanVO> res = new ArrayList<PlanVO>();
		res.add(vo);
		planList=res;
		return Configure.SUCCESS;
	}
	
	public String modifyPlan(){
		Map<String, String> params = getParams();
		String start = params.get("start");
		String end = params.get("end");
		long staff = Long.parseLong(params.get("staff"));
		String operation_time = params.get("time");
		int status = Integer.parseInt(params.get("status"));
		PlanVO vo = new PlanVO();
		vo.setStart_date(start);
		vo.setEnd_date(end);
		vo.setStaff_id(staff);
		vo.setOperation_time(operation_time);
		vo.setStatus(status);
		ps.modify(vo);
		ArrayList<PlanVO> res = new ArrayList<PlanVO>();
		res.add(vo);
		planList=res;
		return Configure.SUCCESS;
	}
	
	public String deletePlan(){
		System.out.println("planJsonController:deletePlan");
		System.out.println(getParams().toString());
		String spanid = getParams().get("id").trim();
		String[] temp = spanid.split("\\+");
		for(String id:temp){
			if(!id.equals("")){
				System.out.println(id);
				ps.delete(Long.parseLong(id));
			}
		}
		return Configure.SUCCESS;
	}

	public String commodOfPlan(){
		System.out.println("planJsonController:commodOfPlan");
		long id = Long.parseLong(getParams().get("plan_id").trim());
		commodOfPlan = ps.getCommodOfPlan(id);
		for(CommodOfPlanVO vo:commodOfPlan){
			vo.setCommod_name(cs.getById(vo.getCommod_id()).getName());
		}
		return Configure.SUCCESS;
	}
	
	public String saleableOfShop(){
		System.out.println("saleable");
		System.out.println(getParams().toString());
		String date = getParams().get("date").trim();
		ShopVO shop = (ShopVO) session().getAttribute("shop");
		long shop_id = shop.getShop_id();
		commodOfPlan = ps.saleable(date,shop_id);
		for(CommodOfPlanVO commod:commodOfPlan){
			CommodityVO vo = cs.getById(commod.getCommod_id());
			commod.setCommod_name(vo.getName());
			commod.setReserve_number(0);
			commod.setNumber("<a class='plus' href='javascript:void(0);' onclick='plusClick(this);'><span class='glyphicon glyphicon-plus'></span></a>    <span class='number'>0</span>    <a class='minus' href='javascript:void(0);' onclick='minusClick(this);'><span class='glyphicon glyphicon-minus'></span></a>");
		}
		return Configure.SUCCESS;
	}
	
	public ArrayList<PlanVO> getPlanList() {
		return planList;
	}

	public void setPlanList(ArrayList<PlanVO> planList) {
		this.planList = planList;
	}

	public long getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(long plan_id) {
		this.plan_id = plan_id;
	}

	public ArrayList<CommodOfPlanVO> getCommodOfPlan() {
		return commodOfPlan;
	}

	public void setCommodOfPlan(ArrayList<CommodOfPlanVO> commodOfPlan) {
		this.commodOfPlan = commodOfPlan;
	}
}
