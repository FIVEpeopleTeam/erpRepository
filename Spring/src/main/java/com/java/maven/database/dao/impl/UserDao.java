/**
 *
 * @Title: UserDao.java
 * @package: com.java.maven.database.dao
 * @Description: TODO
 * 
 * @version: V_1.0
 * @data: 2018-12-25
 * @author: UZI
 *
 */
package com.java.maven.database.dao.impl;

import com.java.maven.database.dao.IUserDao;

/**
 * 
 * @ClassName: UserDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-25
 * @author: UZI
 *
 */
public class UserDao implements IUserDao {
	public void save() {
		System.out.println("save");
	}

	/**
	 * <p>Title: IUserDao</p>
	 * <p>Description: </p>
	 * @see com.java.maven.database.dao.IUserDao#delect()
	 */
	public void delect() {
		System.out.println("delect");
		
	}
}
