package spring.services.user.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.domain.User;
import spring.service.user.UserDao;
import spring.service.user.UserService;

/*
 * FileName : SpringJdbcUserDaoTestApp07.java
 */
public class SpringJdbcUserDaoTestApp07 {
	///Main Method
	public static void main(String[] args) throws Exception{

		ApplicationContext context =
				new ClassPathXmlApplicationContext(
				new String[] {	"/config/datasourceservice.xml",
								"/config/userservice07.xml"	 }
								//"/config/userservice08.xml"	 }
								//"/config/userservice09.xml"	 }
									                                                    );
		//==> IoC Container �� ���� ȹ���� UserDAO �ν��Ͻ� ȹ��
		UserService userService 
							= (UserService)context.getBean("springUserServiceImpl07");
							//= (UserService)context.getBean("springUserServiceImpl08");
							//= (UserService)context.getBean("springUserServiceImpl09");
		
		User user = new User("user04","�ָ�","user04",40);

		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		//1.UserService.addUser(user) Test
		System.out.println(":: 1. add(INSERT)  ? ");
		userService.addUser(user);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		//2.UserService.getUser(userId) Test
		user = userService.getUser("user04");
		System.out.println(":: 2. get(SELECT)  ? "+user);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		//3.UserService.uadateUser(user) Test
		user.setUserName("�庸��");
		System.out.println(":: 3. update(UPDATE)  ? ");
		userService.updateUser(user);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		//4.UserService.getUser(userId) Test
		user = userService.getUser("user04");
		System.out.println(":: 4. get(SELECT)  ? "+user);

		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		//5.UserDAO.removeUser(userId) Test
		//==> UserService ���� removeUser�� �����Ƿ�, DAO���� ���� ȣ�� Test
		UserDao userDAO   = (UserDao)context.getBean("springJdbcUserDaoImpl06");
											//=(UserDao)context.getBean("springJdbcUserDaoImpl08");
											//=(UserDao)context.getBean("springJdbcUserDaoImpl09");
		System.out.println(":: 5. remove(DELETE)  ? "+userDAO.removeUser("user04"));
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
		//6.UserService.getUserList() Test
		System.out.println(":: 6. all User(SELECT)  ? ");
		List<User> list = userService.getUserList(new User());
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.print( "<"+ ( i +1 )+"> ��° ȸ�� ����... ");
			System.out.println( list.get(i).toString() );
		}
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////");
	}
}//end of class