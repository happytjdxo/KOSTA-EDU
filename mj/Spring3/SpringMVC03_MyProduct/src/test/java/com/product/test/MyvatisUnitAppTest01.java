package com.product.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.product.model.MyProductVO;

//Mybatis Framework 단위테스트..
public class MyvatisUnitAppTest01 {
	public static void main(String[] args) throws Exception {
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();
		
		//폼이 없는 관계로.. 직접 VO를 생성..
		MyProductVO vo = new MyProductVO("아이패드5", "애플", 120);
		session.insert("Product.insertMyProduct", vo);
		session.commit();	//나중에는 이거 넣으면 안된다.. 단위테스트에서만.
		
		System.out.println("INSERT OK!");
	}
}
