package desserthouse.service;

import desserthouse.VO.MemberVO;

public interface MemberService {
	
	public MemberVO login(long id, String password);
	
	public long register(MemberVO vo);
	
	public MemberVO getById(long id);
	
	public void modify(MemberVO vo);
	
}
