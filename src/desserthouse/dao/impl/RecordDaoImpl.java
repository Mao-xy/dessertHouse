package desserthouse.dao.impl;

import java.util.ArrayList;

import desserthouse.dao.RecordDao;
import desserthouse.entity.Record;

@SuppressWarnings("rawtypes")
public class RecordDaoImpl extends BaseDaoImpl implements RecordDao {

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Record> getAllRecord(int type) {
		// TODO Auto-generated method stub
		return (ArrayList<Record>)getListByColumn(Record.class, "type", type);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Record> getRecordByPage(int page, int size, int type) {
		// TODO Auto-generated method stub
		//使用hql,待修改
		return (ArrayList<Record>)getAllByPage(Record.class,page,size);
	}
	

}
