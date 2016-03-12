package desserthouse.controller.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.MemberVO;
import desserthouse.configure.Configure;
import desserthouse.controller.BaseController;
import desserthouse.service.MemberService;

public class MemberJsonController extends BaseController {
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//return
	private String username;
	private String pwd;
	private String birthday;
	private String phone;
	private String card;
	private String address;
	private int points;
	private double balance;
	
	@Autowired
	MemberService ms;
	
	@Override
	public String process(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String modifyUsername(){
		username = getParams().get("username").trim();
		MemberVO mv = (MemberVO)session().getAttribute("member");
		mv.setName(username);
		ms.modify(mv);
		return Configure.SUCCESS;
	}
	
	public String modifyPassword(){
		pwd = getParams().get("pwd").trim();
		MemberVO mv = (MemberVO)session().getAttribute("member");
		mv.setPassword(pwd);
		ms.modify(mv);
		return Configure.SUCCESS;
	}
	
	public String modifyBirthday(){
		birthday = getParams().get("birthday").trim();
		MemberVO mv = (MemberVO)session().getAttribute("member");
		mv.setBirthday(birthday);
		ms.modify(mv);
		return Configure.SUCCESS;
	}
	
	public String modifyPhone(){
		phone = getParams().get("phone").trim();
		MemberVO mv = (MemberVO)session().getAttribute("member");
		mv.setPhone(phone);
		ms.modify(mv);
		return Configure.SUCCESS;
	}

	public String modifyCard(){
		card = getParams().get("card").trim();
		MemberVO mv = (MemberVO)session().getAttribute("member");
		mv.setCard(card);
		ms.modify(mv);
		return Configure.SUCCESS;
	}
	
	public String modifyAddress(){
		address = getParams().get("address").trim();
		MemberVO mv = (MemberVO)session().getAttribute("member");
		mv.setAddress(address);
		ms.modify(mv);
		return Configure.SUCCESS;
	}
	
	public String exchangePoints(){
		MemberVO mv = (MemberVO)session().getAttribute("member");
		int use = Integer.valueOf(getParams().get("points").trim());
		points = mv.getPoints()-use;
		mv.setPoints(points);
		balance = mv.getBalance()+(use/50);
		mv.setBalance(balance);
		ms.modify(mv);
		return Configure.SUCCESS;
	}
	
	public String recharge(){
		System.out.println(1111111);
		double money = Double.parseDouble(getParams().get("money"));
		MemberVO mv = (MemberVO)session().getAttribute("member");
		balance = mv.getBalance()+money;
		mv.setBalance(balance);
		ms.modify(mv);
		return Configure.SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
