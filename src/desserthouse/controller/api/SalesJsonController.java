package desserthouse.controller.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.ReserveVO;
import desserthouse.configure.Configure;
import desserthouse.controller.BaseController;
import desserthouse.service.SalesService;
import desserthouse.util.Tools;

public class SalesJsonController extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	SalesService ss;
	
	private long reserve_id;
	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String addReserve(){
		System.out.println("add reserve");
		System.out.println(getParams().toString());
		//添加reserve记录
		Map<String,String> params = getParams();
		long member_id = Long.parseLong(params.get("member_id").trim());
		long shop_id = Long.parseLong(params.get("shop_id").trim());
		double total = Double.parseDouble(params.get("total"));
		String reserve_date = params.get("reserve_date");
		ReserveVO vo = new ReserveVO();
		vo.setMember_id(member_id);
		vo.setShop_id(shop_id);
		vo.setReserve_date(reserve_date);
		vo.setTotal(total);
		vo.setOperation_time(Tools.getCurrentTime());
		vo.setStatus(Configure.RESERVE_ACTIVE);
		reserve_id = ss.addReserve(vo);
		return Configure.SUCCESS;
	}

	public long getReserve_id() {
		return reserve_id;
	}

	public void setReserve_id(long reserve_id) {
		this.reserve_id = reserve_id;
	}

}
