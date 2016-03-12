package desserthouse.controller.api;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.PlanVO;
import desserthouse.controller.BaseController;
import desserthouse.service.PlanService;

public class MainServerJsonController extends BaseController {

	@Autowired
	PlanService ps;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<PlanVO> planList;
	
	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<PlanVO> getPlanList() {
		return planList;
	}
	public void setPlanList(ArrayList<PlanVO> planList) {
		this.planList = planList;
	}

}
