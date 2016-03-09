package desserthouse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="commodity")
public class Commodity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long commod_id;
	private String name;
	private String images;
	public long getCommod_id() {
		return commod_id;
	}
	public void setCommod_id(long commod_id) {
		this.commod_id = commod_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}

}
