package desserthouse.util;

import java.util.ArrayList;

import desserthouse.VO.CommodOfPlanVO;
import desserthouse.VO.CommodOfReserveVO;
import desserthouse.VO.CommodityVO;
import desserthouse.VO.MemberVO;
import desserthouse.VO.PlanVO;
import desserthouse.VO.RecordVO;
import desserthouse.VO.ReserveVO;
import desserthouse.VO.ShopVO;
import desserthouse.VO.StaffVO;
import desserthouse.entity.CommodOfPlan;
import desserthouse.entity.CommodOfReserve;
import desserthouse.entity.Commodity;
import desserthouse.entity.Member;
import desserthouse.entity.Plan;
import desserthouse.entity.Record;
import desserthouse.entity.Reserve;
import desserthouse.entity.Shop;
import desserthouse.entity.Staff;

public class Transform {
	
	public static StaffVO staff2VO(Staff s){
		StaffVO vo = new StaffVO();
		vo.setId(s.getId());
		vo.setStaff_id(s.getStaff_id());
		vo.setName(s.getName());
		vo.setPassword(s.getPassword());
		vo.setSex(s.getSex());
		vo.setBirthday(s.getBirthday());
		vo.setPhone(s.getPhone());
		vo.setCard(s.getCard());
		vo.setShop_id(s.getShop_id());
		vo.setSalary(s.getSalary());
		vo.setPost(s.getPost());
		vo.setJoining_time(s.getJoining_time());
		return vo;
	}
	
	public static Staff vo2staff(StaffVO vo){
		Staff s = new Staff();
		s.setId(vo.getId());
		s.setStaff_id(vo.getStaff_id());
		s.setName(vo.getName());
		s.setPassword(vo.getPassword());
		s.setSex(vo.getSex());
		s.setBirthday(vo.getBirthday());
		s.setPhone(vo.getPhone());
		s.setCard(vo.getCard());
		s.setShop_id(vo.getShop_id());
		s.setSalary(vo.getSalary());
		s.setPost(vo.getPost());
		s.setJoining_time(vo.getJoining_time());
		return s;
	}
	
	public static ArrayList<StaffVO> staffList2vo(ArrayList<Staff> list){
		ArrayList<StaffVO> res = new ArrayList<StaffVO>();
		for(Staff s:list){
			StaffVO vo = new StaffVO();
			vo.setId(s.getId());
			vo.setStaff_id(s.getStaff_id());
			vo.setName(s.getName());
			vo.setPassword(s.getPassword());
			vo.setSex(s.getSex());
			vo.setBirthday(s.getBirthday());
			vo.setPhone(s.getPhone());
			vo.setCard(s.getCard());
			vo.setShop_id(s.getShop_id());
			vo.setSalary(s.getSalary());
			vo.setPost(s.getPost());
			vo.setJoining_time(s.getJoining_time());
			res.add(vo);
		}
		return res;
	}
	public static Member VO2member(MemberVO vo){
		Member mb = new Member();
		mb.setMember_id(vo.getMember_id());
		mb.setName(vo.getName());
		mb.setPassword(vo.getPassword());
		mb.setSex(vo.getSex());
		mb.setBirthday(vo.getBirthday());
		mb.setPhone(vo.getPhone());
		mb.setCard(vo.getCard());
		mb.setAddress(vo.getAddress());
		mb.setPoints(vo.getPoints());
		mb.setRank(vo.getRank());
		mb.setBalance(vo.getBalance());
		mb.setStatus(vo.getStatus());
		return mb;
	}
	
	public static MemberVO member2VO(Member mb){
		MemberVO vo = new MemberVO();
		vo.setMember_id(mb.getMember_id());
		vo.setName(mb.getName());
		vo.setPassword(mb.getPassword());
		vo.setSex(mb.getSex());
		vo.setBirthday(mb.getBirthday());
		vo.setPhone(mb.getPhone());
		vo.setCard(mb.getCard());
		vo.setAddress(mb.getAddress());
		vo.setPoints(mb.getPoints());
		vo.setRank(mb.getRank());
		vo.setBalance(mb.getBalance());
		vo.setStatus(mb.getStatus());
		String stringid = String.valueOf(mb.getMember_id());
		while(stringid.length()<7){
			stringid = "0"+stringid;
		}
		vo.setStringId(stringid);
		return vo;
	}
	
	public static ArrayList<ShopVO> shopList2VO(ArrayList<Shop> list){
		ArrayList<ShopVO> res = new ArrayList<ShopVO>();
		for(int i=0;i<list.size();i++){
			Shop s = list.get(i);
			ShopVO vo = new ShopVO();
			vo.setShop_id(s.getShop_id());
			vo.setName(s.getName());
			vo.setAddress(s.getAddress());
			vo.setOpening_time(s.getOpening_time());
			vo.setOwner(s.getOwner());
			vo.setPhone(s.getPhone());
			res.add(vo);
		}
		return res;
	}
	
	public static Shop vo2shop(ShopVO vo){
		Shop s = new Shop();
		s.setShop_id(vo.getShop_id());
		s.setName(vo.getName());
		s.setAddress(vo.getAddress());
		s.setOpening_time(vo.getOpening_time());
		s.setOwner(vo.getOwner());
		s.setPhone(vo.getPhone());
		return s;
	}
	
	public static ShopVO shop2vo(Shop s){
		ShopVO vo = new ShopVO();
		vo.setShop_id(s.getShop_id());
		vo.setName(s.getName());
		vo.setAddress(s.getAddress());
		vo.setOpening_time(s.getOpening_time());
		vo.setOwner(s.getOwner());
		vo.setPhone(s.getPhone());
		return vo;
	}
	
	public static ArrayList<CommodityVO> commodList2VO(ArrayList<Commodity> list){
		ArrayList<CommodityVO> res = new ArrayList<CommodityVO>();
		for(int i=0;i<list.size();i++){
			Commodity cm = list.get(i);
			CommodityVO vo = new CommodityVO();
			vo.setCommod_id(cm.getCommod_id());
			vo.setName(cm.getName());
			vo.setImages(cm.getImages());
			res.add(vo);
		}
		return res;
	}
	
	public static CommodityVO commod2vo(Commodity commod){
		CommodityVO vo = new CommodityVO();
		vo.setCommod_id(commod.getCommod_id());
		vo.setName(commod.getName());
		vo.setImages(commod.getImages());
		return vo;
	}
	
	public static ArrayList<RecordVO> recordList2VO(ArrayList<Record> list){
		ArrayList<RecordVO> res = new ArrayList<RecordVO>();
		for (int i=0;i<list.size();i++){
			Record r = list.get(i);
			RecordVO vo = new RecordVO();
			vo.setRecord_id(r.getRecord_id());
			vo.setMember_id(r.getMember_id());
			vo.setOperation_time(r.getOperation_time());
			vo.setMoney(r.getMoney());
			vo.setType(r.getType());
			vo.setWay(r.getWay());
			res.add(vo);
		}
		return res;
	}
	
	public static ArrayList<PlanVO> planList2vo(ArrayList<Plan> list){
		ArrayList<PlanVO> res = new ArrayList<PlanVO>();
		for(Plan plan:list){
			PlanVO vo = new PlanVO();
			vo.setPlan_id(plan.getPlan_id());
			vo.setStart_date(plan.getStart_date());
			vo.setEnd_date(plan.getEnd_date());
			vo.setStaff_id(plan.getStaff_id());
			vo.setOperation_time(plan.getOperation_time());
			vo.setStatus(plan.getStatus());
			res.add(vo);
		}
		return res;
	}
	public static ArrayList<Plan> voList2plan(ArrayList<PlanVO> list){
		ArrayList<Plan> res = new ArrayList<Plan>();
		for(PlanVO vo:list){
			Plan p = new Plan();
			p.setPlan_id(vo.getPlan_id());
			p.setStart_date(vo.getStart_date());
			p.setEnd_date(vo.getEnd_date());
			p.setStaff_id(vo.getStaff_id());
			p.setOperation_time(vo.getOperation_time());
			p.setStatus(vo.getStatus());
			res.add(p);
		}
		return res;
	}
	
	public static PlanVO plan2vo(Plan plan){
		PlanVO vo = new PlanVO();
		vo.setPlan_id(plan.getPlan_id());
		vo.setStart_date(plan.getStart_date());
		vo.setEnd_date(plan.getEnd_date());
		vo.setStaff_id(plan.getStaff_id());
		vo.setOperation_time(plan.getOperation_time());
		vo.setStatus(plan.getStatus());
		return vo;
	}
	
	public static Plan vo2plan(PlanVO vo){
		Plan p = new Plan();
		p.setPlan_id(vo.getPlan_id());
		p.setStart_date(vo.getStart_date());
		p.setEnd_date(vo.getEnd_date());
		p.setStaff_id(vo.getStaff_id());
		p.setOperation_time(vo.getOperation_time());
		p.setStatus(vo.getStatus());
		return p;
	}
	
	public static ArrayList<CommodOfPlanVO> commodOfPlan2vo(ArrayList<CommodOfPlan> list){
		ArrayList<CommodOfPlanVO> res = new ArrayList<CommodOfPlanVO>();
		for(CommodOfPlan entity:list){
			CommodOfPlanVO vo = new CommodOfPlanVO();
			vo.setPlanlist_id(entity.getPlanlist_id());
			vo.setPlan_id(entity.getPlan_id());
			vo.setCommod_id(entity.getCommod_id());
			vo.setAmount(entity.getAmount());
			vo.setPrice(entity.getPrice());
			res.add(vo);
		}
		return res;
	}
	
	public static ArrayList<CommodOfPlan> vo2commodOfPlan(ArrayList<CommodOfPlanVO> list){
		ArrayList<CommodOfPlan> res = new ArrayList<CommodOfPlan>();
		for(CommodOfPlanVO vo:list){
			CommodOfPlan e = new CommodOfPlan();
			e.setPlanlist_id(vo.getPlanlist_id());
			e.setPlan_id(vo.getPlan_id());
			e.setCommod_id(vo.getCommod_id());
			e.setAmount(vo.getAmount());
			e.setPrice(vo.getPrice());
			res.add(e);
		}
		return res;
	}
	
	public static ArrayList<CommodOfReserveVO> commodOfReserve2vo(ArrayList<CommodOfReserve> list){
		ArrayList<CommodOfReserveVO> res = new ArrayList<CommodOfReserveVO>();
		for(CommodOfReserve entity:list){
			CommodOfReserveVO vo = new CommodOfReserveVO();
			vo.setReservelist_id(entity.getReservelist_id());
			vo.setReserve_id(entity.getReserve_id());
			vo.setCommod_id(entity.getCommod_id());
			vo.setAmount(entity.getAmount());
			vo.setPrice(entity.getPrice());
			res.add(vo);
		}
		return res;
	}
	
	public static ArrayList<CommodOfReserve> vo2commodOfReserve(ArrayList<CommodOfReserveVO> list){
		ArrayList<CommodOfReserve> res = new ArrayList<CommodOfReserve>();
		for(CommodOfReserveVO vo:list){
			CommodOfReserve e = new CommodOfReserve();
			e.setReservelist_id(vo.getReservelist_id());
			e.setReserve_id(vo.getReserve_id());
			e.setCommod_id(vo.getCommod_id());
			e.setAmount(vo.getAmount());
			e.setPrice(vo.getPrice());
			res.add(e);
		}
		return res;
	}
	
	public static Reserve vo2reserve(ReserveVO vo){
		Reserve r = new Reserve();
		r.setReserve_id(vo.getReserve_id());
		r.setMember_id(vo.getMember_id());
		r.setShop_id(vo.getShop_id());
		r.setTotal(vo.getTotal());
		r.setReserve_date(vo.getReserve_date());
		r.setOperation_time(vo.getOperation_time());
		r.setStatus(vo.getStatus());
		return r;
	}
}
