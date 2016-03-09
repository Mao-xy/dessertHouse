package desserthouse.VO;

public class CommodOfPlanVO {

	private long planlist_id;
	private long plan_id;
	private long commod_id;
	private String commod_name;
	private int amount;
	private double price;
	private String number;
	private int reserve_number;
	public long getPlanlist_id() {
		return planlist_id;
	}
	public void setPlanlist_id(long planlist_id) {
		this.planlist_id = planlist_id;
	}
	public long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(long plan_id) {
		this.plan_id = plan_id;
	}
	public long getCommod_id() {
		return commod_id;
	}
	public void setCommod_id(long commod_id) {
		this.commod_id = commod_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCommod_name() {
		return commod_name;
	}
	public void setCommod_name(String commod_name) {
		this.commod_name = commod_name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getReserve_number() {
		return reserve_number;
	}
	public void setReserve_number(int reserve_number) {
		this.reserve_number = reserve_number;
	}
	
}
