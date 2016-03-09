package desserthouse.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.CommodOfPlanVO;
import desserthouse.VO.PlanVO;
import desserthouse.dao.PlanDao;
import desserthouse.service.PlanService;
import desserthouse.util.Tools;
import desserthouse.util.Transform;

public class PlanServiceImpl implements PlanService {

	@Autowired
	PlanDao pd;
	
	@Override
	public ArrayList<PlanVO> getAllPlan() {
		// TODO Auto-generated method stub
		return Transform.planList2vo(pd.getAllPlan());
	}

	@Override
	public ArrayList<PlanVO> getPlanByStaff(long id) {
		// TODO Auto-generated method stub
		return Transform.planList2vo(pd.getPlanByStaff(id));
	}

	@Override
	public ArrayList<PlanVO> getPlanByStatus(int status) {
		// TODO Auto-generated method stub
		return Transform.planList2vo(pd.getPlanByStatus(status));
	}

	@Override
	public long add(PlanVO vo) {
		// TODO Auto-generated method stub
		return pd.add(Transform.vo2plan(vo));
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		pd.delete(id);
	}

	@Override
	public void modify(PlanVO vo) {
		// TODO Auto-generated method stub
		pd.modify(Transform.vo2plan(vo));
	}

	@Override
	public ArrayList<CommodOfPlanVO> getCommodOfPlan(long plan_id) {
		// TODO Auto-generated method stub
		return Transform.commodOfPlan2vo(pd.getCommodOfPlan(plan_id));
	}

	@Override
	public ArrayList<String> addCommodOfPlan(ArrayList<CommodOfPlanVO> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyCommodOfPlan(CommodOfPlanVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCommodOfPlan(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByPlan(long plan_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<CommodOfPlanVO> saleable(String date, long id) {
		// TODO Auto-generated method stub
		return Transform.commodOfPlan2vo(pd.saleable(Tools.getMonday(date),
				Tools.getSunday(date), id));
	}
	
}
