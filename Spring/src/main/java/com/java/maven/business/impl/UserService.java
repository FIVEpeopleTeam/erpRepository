/**
 *
 * @Title: UserService.java
 * @package: com.java.maven.business
 * @Description: TODO
 * 
 * @version: V_1.0
 * @data: 2018-12-25
 * @author: UZI
 *
 */
package com.java.maven.business.impl;

import com.java.maven.business.IUserService;
import com.java.maven.database.dao.IUserDao;


/**
 * 
 * @ClassName: UserService
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-25
 * @author: UZI
 *
 */
public class UserService implements IUserService {
	private IUserDao userDao;

	
	
	public IUserDao getUserDao() {
		return userDao;
	}



	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}



	public void save() {
		userDao.save();
	}
	
	public void delect() {
		userDao.delect();
	}
}
