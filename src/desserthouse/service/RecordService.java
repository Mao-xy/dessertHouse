package desserthouse.service;

import java.util.ArrayList;

import desserthouse.VO.RecordVO;

public interface RecordService {
	
	ArrayList<RecordVO> getAll(int type);
	
	ArrayList<RecordVO> getByPage(int page, int size, int type);

}
