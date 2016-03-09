package desserthouse.dao;

import desserthouse.entity.Member;

public interface MemberDao {
	
	public Member login(long id, String password);
	
	public long register(Member member);
	
	public Member getById(long id);

	public void modify(Member member);
}
