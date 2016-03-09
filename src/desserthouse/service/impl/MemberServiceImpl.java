package desserthouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.MemberVO;
import desserthouse.dao.MemberDao;
import desserthouse.entity.Member;
import desserthouse.service.MemberService;
import desserthouse.util.Transform;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao md;
	@Override
	public MemberVO login(long id, String password) {
		// TODO Auto-generated method stub
		Member mb = md.login(id, password);
		if(mb==null){
			return null;
		}
		else{
			return Transform.member2VO(mb);
		}
	}

	@Override
	public long register(MemberVO vo) {
		// TODO Auto-generated method stub
		return md.register(Transform.VO2member(vo));
	}

	@Override
	public MemberVO getById(long id) {
		// TODO Auto-generated method stub
		return Transform.member2VO(md.getById(id));
	}

	@Override
	public void modify(MemberVO vo) {
		// TODO Auto-generated method stub
		md.modify(Transform.VO2member(vo));
	}

}
