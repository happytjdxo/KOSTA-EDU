package model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/*
NamingService를 이용
싱글톤 방식으로 객체를 생성
-->DataSource를 리턴 받을 것이다.
 */
public class DataSourceManager {
	private DataSource ds;
	private static DataSourceManager instance = new DataSourceManager();
	private DataSourceManager(){
		try{
			Context ic = new InitialContext();
			ds=(DataSource)ic.lookup("java:comp/env/jdbc/oracleDB");
			System.out.println("Datasource Lookup......");
		}catch(Exception e){
			System.out.println("DataSource를 찾아오지 못했습니다.");
		}
	}
	public static DataSourceManager getInstance(){
		return instance;
	}
	
	public DataSource getConnection(){
		return ds;
	}
}
