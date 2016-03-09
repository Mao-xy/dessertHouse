package desserthouse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="commodofplan")
public class CommodOfPlan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long planlist_id;
	private long plan_id;
	private long commod_id;
	private int amount;
	private double price;
	
	public long getPlanlist_id() {
		return planlist_id;
	}
	public void setPlanlist_id(long planlist_id) {
		this.planlist_id = planlist_id;
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
	public long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(long plan_id) {
		this.plan_id = plan_id;
	}
}
