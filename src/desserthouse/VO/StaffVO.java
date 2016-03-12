package desserthouse.VO;

public class StaffVO {
	private long id;
	private String staff_id;
	private String name;
	private String password;
	private int sex;
	private String sexInString;
	private String birthday;
	private String phone;
	private String card;
	private long shop_id;
	private String shop_name;
	private double salary;
	private int post;
	private String postInString;
	private String joining_time;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public long getShop_id() {
		return shop_id;
	}
	public void setShop_id(long shop_id) {
		this.shop_id = shop_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	public String getJoining_time() {
		return joining_time;
	}
	public void setJoining_time(String joining_time) {
		this.joining_time = joining_time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSexInString() {
		return sexInString;
	}
	public void setSexInString(String sexInString) {
		this.sexInString = sexInString;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getPostInString() {
		return postInString;
	}
	public void setPostInString(String postInString) {
		this.postInString = postInString;
	}
}
