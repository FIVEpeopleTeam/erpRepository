/**
 *
 * @Title: MySqlDBManager.java
 * @package: datebase
 * @Description: 
 * 
 * @version: V_1.0
 * @data: 2018-12-16
 * @author: Victor Woods
 * 
 */
package datebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import datebase.tools.DatabaseUtil;

/**
 * 
 * @ClassName: MySqlDBManager
 * @Description: 
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-16
 * @author: Victor Woods
 *
 */

                      
  public class MySqlDBManager implements DBManager{
	 static {
		 String driver=DatabaseUtil.getValue("driver");
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }


	/**
	 * <p>Title: DBManager</p>
	 * <p>Description: </p>
	 * @return
	 * @throws SQLException
	 * @see datebase.DBManager#openConnection()
	 */
	@Override
	public Connection openConnection() throws SQLException {
		String url=DatabaseUtil.getValue("url");
		String username=DatabaseUtil.getValue("username");
		String password=DatabaseUtil.getValue("password");
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * <p>Title: DBManager</p>
	 * <p>Description: </p>
	 * @param conn
	 * @throws SQLException
	 * @see datebase.DBManager#closeConnection(java.sql.Connection)
	 */
	@Override
	public void closeConnection(Connection conn) throws SQLException {
		if(conn!=null && !conn.isClosed()) {
			conn.close();
		}
		
	}

	/**
	 * <p>Title: DBManager</p>
	 * <p>Description: </p>
	 * @param conn
	 * @param sql
	 * @param parameters
	 * @return
	 * @throws SQLException
	 * @see datebase.DBManager#execute(java.sql.Connection, java.lang.String, java.lang.Object[])
	 */

	@Override
	public int execute(Connection conn, String sql, Object... parameters)
			throws SQLException {
		int count=0;
		if(conn!=null && !conn.isClosed()) {
			PreparedStatement ps=conn.prepareStatement(sql);
			if(parameters!=null) {
				for(int i=0;i<parameters.length;i++) {
					ps.setObject(i+1, parameters[i]);
				}
			}
			count=ps.executeUpdate();
;		}
		return count;
	}

	/**
	 * <p>Title: DBManager</p>
	 * <p>Description: </p>
	 * @param conn
	 * @param sql
	 * @param parameters
	 * @return
	 * @throws SQLException
	 * @see datebase.DBManager#query(java.sql.Connection, java.lang.String, java.lang.Object[])
	 */
	@Override
	public ResultSet query(Connection conn, String sql, Object... parameters)
			throws SQLException {
		ResultSet rs=null;
		if(conn!=null && !conn.isClosed()) {
			PreparedStatement ps=conn.prepareStatement(sql);
			if(parameters!=null) {
				for(int i=0;i<parameters.length;i++) {
					ps.setObject(i+1, parameters[i]);
				}
			}
			rs = ps.executeQuery();
//			将查询结果赋值
		}
		return rs;
	}
  }
