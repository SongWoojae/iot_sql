package com.iot1.sql.db.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot1.sql.db.dao.DbDAO;
import com.iot1.sql.db.dto.Column;
import com.iot1.sql.db.dto.DataBase;
import com.iot1.sql.db.dto.DbInfo;
import com.iot1.sql.db.dto.Table;

@Service
public class DbServiceImpl implements DbService{
	
	@Autowired
	DbDAO dDao;

	@Override
	public List<DbInfo> getDbInfoList(DbInfo di) {
		// TODO Auto-generated method stub
		return dDao.selectDbInfoList(di);
	}

	@Override
	public List<DataBase> getDateBaseList() throws Exception {
		// TODO Auto-generated method stub
		return dDao.selectDataBaseList();
	}

	@Override
	public boolean isConnectDB(DbInfo pDi) throws Exception {
		// TODO Auto-generated method stub
		DbInfo di = dDao.selectDbInfo(pDi);
		return dDao.isConnectDB(di);
	}

	@Override
	public List<Table> getTableList(DataBase di) throws Exception {
		// TODO Auto-generated method stub
		return dDao.selectTableList(di);
	}

	@Override
	public List<Column> getTableInfo(Table table) throws Exception {
		// TODO Auto-generated method stub
		return dDao.selectTableInfo(table);
	}

	@Override
	public Map<String, Object> runSql(Map<String, String> pm) throws Exception {
		// TODO Auto-generated method stub
		return dDao.runSql(pm);
	}

	@Override
	public Map<String, Object> runSqls(Map<String, List> pm) throws Exception {
		// TODO Auto-generated method stub
		return dDao.runSqls(pm);
	}

}
