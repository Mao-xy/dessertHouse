package desserthouse.VO;

public class ReserveVO {
	private long reserve_id;
	private long member_id;
	private long shop_id;
	private double total;
	private String reserve_date;
	private String operation_time;
	private int status;
	public long getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(long reserve_id) {
		this.reserve_id = reserve_id;
	}
	public long getMember_id() {
		return member_id;
	}
	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}
	public long getShop_id() {
		return shop_id;
	}
	public void setShop_id(long shop_id) {
		this.shop_id = shop_id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getReserve_date() {
		return reserve_date;
	}
	public void setReserve_date(String reserve_date) {
		this.reserve_date = reserve_date;
	}
	public String getOperation_time() {
		return operation_time;
	}
	public void setOperation_time(String operation_time) {
		this.operation_time = operation_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
