package desserthouse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="commodofreserve")
public class CommodOfReserve {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long reservelist_id;
	private long reserve_id;
	private long commod_id;
	private int amount;
	private double price;
	public long getReservelist_id() {
		return reservelist_id;
	}
	public void setReservelist_id(long reservelist_id) {
		this.reservelist_id = reservelist_id;
	}
	public long getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(long reserve_id) {
		this.reserve_id = reserve_id;
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
}
