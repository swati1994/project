package mytestapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.Login;
import com.LoginService;

public class TestLoginService {

	private LoginService service;
	
	@Before
	public void setUp(){
		service=new LoginService();
	}
	@Test
	public void testifCheck(){
		Login login=new Login();
		login.setName("lalitha");
		login.setPass("password123");
		Assert.assertTrue(service.checkUser(login));
	}
	@Test
	public void testElseCheck(){
		Login login=new Login();
		login.setName("admin");
		login.setPass("admin");
		Assert.assertFalse(service.checkUser(login));
	}
}
