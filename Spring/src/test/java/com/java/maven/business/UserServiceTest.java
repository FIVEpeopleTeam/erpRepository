/**
 *
 * @Title: UserServiceTest.java
 * @package: com.java.maven.business
 * @Description: TODO
 * 
 * @version: V_1.0
 * @data: 2018-12-25
 * @author: UZI
 *
 */
package com.java.maven.business;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.maven.business.impl.UserService;

/**
 * 
 * @ClassName: UserServiceTest
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-25
 * @author: UZI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/applicationContext.xml"})
public class UserServiceTest {
	//自动引用
	@Autowired
	private UserService userService;
	
	
	
	@Test
	public void saveTest() {
		userService.save();
	}
	@Test
	public void delectTest() {
		userService.delect();
	}
	@Test
	public void delectTest1() {
		userService.delect();
	}
}
