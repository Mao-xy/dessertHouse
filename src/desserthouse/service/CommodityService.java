package desserthouse.service;

import java.util.ArrayList;

import desserthouse.VO.CommodityVO;

public interface CommodityService {
	
	public ArrayList<CommodityVO> getAll();
	
	public ArrayList<CommodityVO> getCommodByPage(int page, int size);

	public CommodityVO getById(long id);
}
