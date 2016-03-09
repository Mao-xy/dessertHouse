package desserthouse.controller.html;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.MemberVO;
import desserthouse.VO.ShopVO;
import desserthouse.configure.Configure;
import desserthouse.controller.BaseController;
import desserthouse.service.CommodityService;
import desserthouse.service.MemberService;
import desserthouse.service.RecordService;
import desserthouse.service.ShopService;
import desserthouse.util.Tools;

public class MemberController extends BaseController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	MemberService ms;
	@Autowired
	ShopService ss;
	@Autowired
	CommodityService cs;
	@Autowired
	RecordService rs;
	
	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		
		long id = Long.parseLong(params.get("userid").trim());
		String pwd = params.get("password").trim();
		MemberVO member = ms.login(id,pwd);
		if(member!=null){
			session().setAttribute("member_id", id);
			session().setAttribute("shopList", ss.getAll());
			session().setAttribute("commodList", cs.getAll());
			session().setAttribute("member", member);
			session().setAttribute("expand_record", rs.getAll(Configure.EXPEND));
			session().setAttribute("recharge_record", rs.getAll(Configure.RECHARGE));
			return Configure.SUCCESS;
		}
		return Configure.ERROR;
	}
	
	public String register(){
		Map<String, String> params = getParams();
		String username = params.get("username").trim();
		String pwd = params.get("password").trim();
		String sex = params.get("sex").trim();
		String phone = params.get("phone").trim();
		String address = params.get("address").trim();
		MemberVO vo = new MemberVO();
		vo.setName(username);
		vo.setPassword(pwd);
		vo.setSex(Integer.parseInt(sex));
		vo.setPhone(phone);
		vo.setAddress(address);
		vo.setStatus(Configure.NEWLY);
		long member_id = ms.register(vo);
		session().setAttribute("member_id", member_id);
		System.out.println(member_id);
		return Configure.SUCCESS;
	}
	
	public String logout(){
		@SuppressWarnings("rawtypes")
		Enumeration e = session().getAttributeNames();  
		while (e.hasMoreElements())  
		{  
		    String sessionName = (String) e.nextElement();  
		    System.out.println("存在的session有：" + sessionName);  
		    session().removeAttribute(sessionName);  
		} 
		return Configure.SUCCESS;
	}
	
	public String redirect(){
		String type = getParams().get("type");
		if(type.equals("reserve")){
			ArrayList<String> available = Tools.getTwoWeek();
			session().setAttribute("available", available);
			long shop_id = Long.parseLong(getParams().get("shop_id"));
			ShopVO shop = ss.getById(shop_id);
			session().setAttribute("shop", shop);
			//获得该店的所有可预定产品
		}
		return type;
	}
}
