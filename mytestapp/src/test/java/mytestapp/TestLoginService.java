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
		login.setName("admin");
		login.setPass("admin");
		Assert.assertTrue(service.checkUser(login));
	}
	@Test
	public void testElseCheck(){
		Login login=new Login();
		login.setName("admin");
		login.setPass("admin1");
		Assert.assertFalse(service.checkUser(login));
	}
}
