package desserthouse.dao;

import desserthouse.entity.Reserve;

public interface SalesDao {

	public long addReserve(Reserve reserve);
	
	/*
	 * 获得该会员预定的所有产品
	 */
	//public ArrayList<Reserve> getByMember(long member_id);
}
