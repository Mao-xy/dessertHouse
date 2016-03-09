package desserthouse.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.CommodityVO;
import desserthouse.dao.CommodityDao;
import desserthouse.service.CommodityService;
import desserthouse.util.Transform;

public class CommodityServiceImpl implements CommodityService {

	@Autowired
	CommodityDao cd;
	@Override
	public ArrayList<CommodityVO> getAll() {
		// TODO Auto-generated method stub
		return Transform.commodList2VO(cd.getAllCommod());
	}

	@Override
	public ArrayList<CommodityVO> getCommodByPage(int page, int size) {
		// TODO Auto-generated method stub
		return Transform.commodList2VO(cd.getCommodByPage(page, size));
	}

	@Override
	public CommodityVO getById(long id) {
		// TODO Auto-generated method stub
		return Transform.commod2vo(cd.getById(id));
	}

}
