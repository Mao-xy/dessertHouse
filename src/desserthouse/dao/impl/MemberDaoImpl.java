package desserthouse.dao.impl;

import desserthouse.dao.MemberDao;
import desserthouse.entity.Member;

@SuppressWarnings("rawtypes")
public class MemberDaoImpl extends BaseDaoImpl implements MemberDao{

	@Override
	public Member login(long id, String password) {
		// TODO Auto-generated method stub
		Member member = (Member)getById(Member.class, id);
		if(member.getPassword().equals(password)){
			return member;
		}
		else{
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public long register(Member member) {
		// TODO Auto-generated method stub
		return add(member);
	}
	
	public Member getById(long id){
		return (Member)getById(Member.class, id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public void modify(Member member) {
		// TODO Auto-generated method stub
		update(member);
	}

}
