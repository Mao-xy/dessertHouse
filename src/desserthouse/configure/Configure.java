package desserthouse.configure;

public class Configure {
	/*
	 * **************************************** common value
	 * ****************************************
	 */
	// delete_flag
	public static final int DELETE_FLAG_FALSE = 0;
	public static final int DELETE_FLAG_TRUE = 1;
	// return
	public static final String SUCCESS = "success";
	public static final String ERROR = "error";
	//换行符
	public static final String NEW_LINE = "<br/>";
	
	//性别
	public static final int MALE = 1;
	public static final int FEMALE = 0;
	//会员等级
	public static final int ORDINARY = 0;
	public static final int BRONZE = 3;
	public static final int SILVER = 2;
	public static final int GOLDEN = 1;
	//会员状态
	public static final int NEWLY = -2;
	public static final int PAUSE = 0;
	public static final int ACTIVE = 1;
	public static final int STOP = -1;
	//会员卡充值方式
	public static final int ONLINE = 0;
	//记录类型
	public static final int EXPEND = 1;
	public static final int RECHARGE = 2;
	//预约状态
	public static final int RESERVE_ACTIVE = 1;
	public static final int RESERVE_DONE = 0;
	
	//员工职位
	public static final int ADMIN = 0;			//ADM
	public static final int MANAGER = 3;			//MAN
	public static final int MAIN_SERVER = 2;		//MSR
	public static final int SALES = 1;				//SER
	//消息类型
	public static final int MSG_APPLY = 0;
	public static final int MSG_AGREE = 1;
	public static final int MSG_DISAGREE = -1;
	//产品计划状态
	public static final int PLAN_APPLY = 0;
	public static final int PLAN_AGREE = 1;
	public static final int PLAN_DISAGREE = -1;
	//审批结果
	public static final String AGREE = "agree";
	public static final String DISAGREE = "disagree";
	
}
