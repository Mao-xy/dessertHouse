package desserthouse.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import desserthouse.VO.RecordVO;
import desserthouse.dao.RecordDao;
import desserthouse.service.RecordService;
import desserthouse.util.Transform;

//所有的get方法都没有考虑没有记录的情况
public class RecordServiceImpl implements RecordService {

	@Autowired
	RecordDao rd;
	@Override
	public ArrayList<RecordVO> getAll(int type) {
		// TODO Auto-generated method stub
		return Transform.recordList2VO(rd.getAllRecord(type));
	}

	@Override
	public ArrayList<RecordVO> getByPage(int page, int size, int type) {
		// TODO Auto-generated method stub
		return Transform.recordList2VO(rd.getRecordByPage(page, size, type));
	}
	
	

}
