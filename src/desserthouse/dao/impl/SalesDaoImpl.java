package desserthouse.dao.impl;

import desserthouse.dao.SalesDao;
import desserthouse.entity.Reserve;

@SuppressWarnings("rawtypes")
public class SalesDaoImpl extends BaseDaoImpl implements SalesDao {

	@SuppressWarnings("unchecked")
	@Override
	public long addReserve(Reserve reserve) {
		// TODO Auto-generated method stub
		return add(reserve);
	}

}
