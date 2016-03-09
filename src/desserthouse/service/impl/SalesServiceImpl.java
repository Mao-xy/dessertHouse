package desserthouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.ReserveVO;
import desserthouse.dao.SalesDao;
import desserthouse.service.SalesService;
import desserthouse.util.Transform;

public class SalesServiceImpl implements SalesService {

	@Autowired
	SalesDao sd;
	
	@Override
	public long addReserve(ReserveVO vo) {
		// TODO Auto-generated method stub
		return sd.addReserve(Transform.vo2reserve(vo));
	}

}
