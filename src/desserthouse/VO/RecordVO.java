package desserthouse.VO;

public class RecordVO {

	private long record_id;
	private long member_id;
	private String operation_time;
	private double money;
	private int type;
	private int way;
	public long getRecord_id() {
		return record_id;
	}
	public void setRecord_id(long record_id) {
		this.record_id = record_id;
	}
	public long getMember_id() {
		return member_id;
	}
	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}
	public String getOperation_time() {
		return operation_time;
	}
	public void setOperation_time(String operation_time) {
		this.operation_time = operation_time;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getWay() {
		return way;
	}
	public void setWay(int way) {
		this.way = way;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
