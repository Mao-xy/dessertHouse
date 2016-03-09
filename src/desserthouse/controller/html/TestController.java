package desserthouse.controller.html;

import java.util.Map;

import desserthouse.configure.Configure;
import desserthouse.controller.BaseController;
import desserthouse.util.Tools;

public class TestController extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		System.out.println(Tools.getTwoWeek());
		return Configure.SUCCESS;
	}

}
