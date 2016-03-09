package desserthouse.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseController extends ActionSupport{
	
	@Override
	public String execute(){
		
		return process(getParams());
	}
	
	public abstract String process(Map<String, String> params);

	public Map<String, String> getParams() {
		Map<String, String[]> in = request().getParameterMap();
		Map<String, String> out = new HashMap<>();
		Iterator<Entry<String, String[]>> i = in.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, String[]> entry = i.next();
			out.put(entry.getKey(), entry.getValue()[0]);
		}
		return out;
	}
	
	protected HttpServletRequest request(){
		HttpServletRequest request = ServletActionContext.getRequest();
		return request;
	}
	
	protected HttpServletResponse response(){
		HttpServletResponse response = ServletActionContext.getResponse();
		return response;
	}
	
	public ActionContext actionContext(){
		ActionContext context = ActionContext.getContext();
		return context;
	}
	
	protected HttpSession session(){
		HttpSession session = request().getSession();
		return session;
	}
}
