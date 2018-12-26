/**
 *
 * @Title: DBManager.java
 * @package: datebase
 * @Description: TODO
 * 
 * @version: V_1.0
 * @data: 2018-12-16
 * @author: Victor Woods
 * 
 */
package datebase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @ClassName: DBManager
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-16
 * @author: Victor Woods
 *
 */



public interface DBManager {
	public Connection openConnection()throws SQLException;
	public void closeConnection(Connection conn)throws SQLException;
	public int execute(Connection conn,String sql,Object...parameters)throws SQLException;
	public ResultSet query(Connection conn,String sql,Object...parameters)throws SQLException;
}
