package desserthouse.dao;

import java.util.ArrayList;

import desserthouse.entity.Record;

public interface RecordDao {

	ArrayList<Record> getAllRecord(int type);
	
	ArrayList<Record> getRecordByPage(int page, int size, int type);
	
}
