package desserthouse.controller.html;

import java.util.Enumeration;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.StaffVO;
import desserthouse.configure.Configure;
import desserthouse.controller.BaseController;
import desserthouse.service.StaffService;

public class StaffController extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	StaffService ss;
	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		String sid = params.get("userid").trim();
		String password = params.get("password").trim();
		StaffVO vo = ss.login(sid, password);
		if(vo!=null){
			session().setAttribute("id", vo.getId());
			session().setAttribute("staff_name", vo.getName());
			return String.valueOf(vo.getPost());
		}
		else{
			return Configure.ERROR;
		}
	}
	
	public String admin(){
		String type = getParams().get("type");
		long id = (long)session().getAttribute("id");
		StaffVO vo = ss.getStaffById(id);
		session().setAttribute("staff_id", id);
		session().setAttribute("staff_name", vo.getName());
		return type;
	}
	
	public String manager(){
		String type = getParams().get("type").trim();
		long id = (long)session().getAttribute("id");
		StaffVO vo = ss.getStaffById(id);
		session().setAttribute("staff_id", id);
		session().setAttribute("staff_name", vo.getName());
		return type;
	}
	
	public String mainServer(){
		String type = getParams().get("type").trim();
		long id = (long)session().getAttribute("id");
		StaffVO vo = ss.getStaffById(id);
		session().setAttribute("staff_id", id);
		session().setAttribute("staff_name", vo.getName());
		return type;
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

}
