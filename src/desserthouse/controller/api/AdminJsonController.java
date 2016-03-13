package desserthouse.controller.api;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.ShopVO;
import desserthouse.VO.StaffVO;
import desserthouse.configure.Configure;
import desserthouse.controller.BaseController;
import desserthouse.service.ShopService;
import desserthouse.service.StaffService;

public class AdminJsonController extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	ShopService shopService;
	@Autowired
	StaffService staffService;
	
	private ArrayList<ShopVO> shopList;
	private ArrayList<StaffVO> staffList;
	
	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String allShop(){
		System.out.println("AdminJsonController:allShop");
		shopList = shopService.getAll();
		return Configure.SUCCESS;
	}
	
	public String staffOfShop(){
		System.out.println("AdminJsonController:staffOfShop");
		long id = Long.parseLong(getParams().get("shop_id").trim());
		System.out.println("shop_id:"+id);
		staffList = staffService.staffOfShop(id);
		for(StaffVO vo:staffList){
			if(vo.getSex()==Configure.MALE){
				vo.setSexInString("男");
			}
			else{
				vo.setSexInString("女");
			}
			if(vo.getPost()==Configure.ADMIN){
				vo.setPostInString("系统管理员");
			}else if(vo.getPost()==Configure.MAIN_SERVER){
				vo.setPostInString("总管");
			}else if(vo.getPost()==Configure.SALES){
				vo.setPostInString("普通店员");
			}else if(vo.getPost()==Configure.MANAGER){
				vo.setPostInString("经理");
			}
		}
		return Configure.SUCCESS;
	}
	
	public String allStaff(){
		System.out.println("AdminJsonController:allStaff");
		staffList = staffService.getAll();
		for(StaffVO vo:staffList){
			if(vo.getSex()==Configure.MALE){
				vo.setSexInString("男");
			}
			else{
				vo.setSexInString("女");
			}
			if(vo.getPost()==Configure.ADMIN){
				vo.setPostInString("系统管理员");
			}else if(vo.getPost()==Configure.MAIN_SERVER){
				vo.setPostInString("总管");
			}else if(vo.getPost()==Configure.SALES){
				vo.setPostInString("普通店员");
			}else if(vo.getPost()==Configure.MANAGER){
				vo.setPostInString("经理");
			}
			if(vo.getShop_id()==0){
				vo.setShop_name("无");
			}else if(vo.getShop_id()==-1){
				vo.setShop_name("未定");
			}
			else{
				vo.setShop_name(shopService.getName(vo.getShop_id()));
			}
			
		}
		return Configure.SUCCESS;
	}
	
	public String removeShop(){
		System.out.println("AdminJsonController:removeShop");
		String shopid = getParams().get("id").trim();
		String[] temp = shopid.split("\\+");
		for(String id:temp){
			if(!id.equals("")){
				System.out.println(id);
				shopService.delete(Long.parseLong(id));
			}
		}
		return Configure.SUCCESS;
	}

	public String addShop(){
		System.out.println("AdminJsonController:addShop");
		Map<String,String> params = getParams();
		System.out.println(params.toString());
		String name = params.get("name").trim();
		String address = params.get("address").trim();
		String opening_time = params.get("opening_time").trim();
		String phone = params.get("phone").trim();
		String owner = params.get("owner").trim();
		ShopVO vo = new ShopVO();
		vo.setName(name);
		vo.setAddress(address);
		vo.setOpening_time(opening_time);
		vo.setPhone(phone);
		vo.setOwner(owner);
		shopService.add(vo);
		return Configure.SUCCESS;
	}
	
	public String modifyShop(){
		Map<String,String> params = getParams();
		long id = Long.parseLong(params.get("id"));
		String field = params.get("field").trim();
		String value = params.get("value").trim();
		if(field.equals("name")){
			shopService.modifyName(id, value);
		}else if(field.equals("address")){
			shopService.modifyAddress(id, value);
		}else if(field.equals("owner")){
			shopService.modifyOwner(id, value);
		}else if(field.equals("phone")){
			shopService.modifyPhone(id, value);
		}
		return Configure.SUCCESS;
	}
	
	public String addStaff(){
		System.out.println("AdminJsonController:addStaff");
		Map<String,String> params = getParams();
		System.out.println(params.toString());
		String name = params.get("name").trim();
		int sex = Integer.parseInt(params.get("sex").trim());
		String birthday = params.get("birthday").trim();
		String phone = params.get("phone").trim();
		String card = params.get("card").trim();
		long shop_id = Long.parseLong(params.get("shop_id").trim());
		double salary = Double.parseDouble(params.get("salary").trim());
		int post = Integer.parseInt(params.get("post").trim());
		String joining_time = params.get("joining_time").trim();
		StaffVO vo = new StaffVO();
		vo.setName(name);
		vo.setPassword("123456");
		vo.setSex(sex);
		vo.setBirthday(birthday);
		vo.setPhone(phone);
		vo.setCard(card);
		vo.setShop_id(shop_id);
		vo.setSalary(salary);
		vo.setPost(post);
		vo.setJoining_time(joining_time);
		staffService.add(vo);
		return Configure.SUCCESS;
	}
	
	public String modifyStaff(){
		System.out.println("AdminJsonController:modifyStaff");
		Map<String,String> params = getParams();
		System.out.println(params.toString());
		String type = params.get("type");
		long id = Long.parseLong(params.get("id"));
		if(type.equals(Configure.INLINE)){
			String field = params.get("field").trim();
			String value = params.get("value").trim();
			if(field.equals("name")){
				staffService.modifyName(id, value);
			}else if(field.equals("phone")){
				staffService.modifyPhone(id, value);
			}else if(field.equals("card")){
				staffService.modifyCard(id, value);
			}else if(field.equals("salary")){
				staffService.modifySalary(id, Double.parseDouble(value));
			}
		}else{
			String staff_id = params.get("staff_id").trim();
			String name = params.get("name").trim();
			int sex = Integer.parseInt(params.get("sex").trim());
			String birthday = params.get("birthday").trim();
			String phone = params.get("phone").trim();
			String card = params.get("card").trim();
			double salary = Double.parseDouble(params.get("salary").trim());
			long shop_id = Long.parseLong(params.get("shop_id").trim());
			int post = Integer.parseInt(params.get("post").trim());
			String joining_time =  params.get("joining_time").trim();
			StaffVO vo = new StaffVO();
			vo.setId(id);
			vo.setStaff_id(staff_id);
			vo.setName(name);
			vo.setCard(card);
			vo.setBirthday(birthday);
			vo.setJoining_time(joining_time);
			vo.setPhone(phone);
			vo.setPassword("123456");
			vo.setPost(post);
			vo.setSalary(salary);
			vo.setSex(sex);
			vo.setShop_id(shop_id);
			staffService.update(vo);
		}
		return Configure.SUCCESS;
	}
	
	public String  removeStaff(){
		System.out.println("AdminJsonController:removeStaff");
		String staffid = getParams().get("id").trim();
		String[] temp = staffid.split("\\+");
		for(String id:temp){
			if(!id.equals("")){
				System.out.println(id);
				staffService.delete(Long.parseLong(id));
			}
		}
		return Configure.SUCCESS;
	}
	public ArrayList<ShopVO> getShopList() {
		return shopList;
	}

	public void setShopList(ArrayList<ShopVO> shopList) {
		this.shopList = shopList;
	}

	public ArrayList<StaffVO> getStaffList() {
		return staffList;
	}

	public void setStaffList(ArrayList<StaffVO> staffList) {
		this.staffList = staffList;
	}

}
