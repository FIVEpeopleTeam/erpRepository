/**
 *
 * @Title: DatabaseUtil.java
 * @package: datebase.tools
 * @Description: TODO
 * 
 * @version: V_1.0
 * @data: 2018-12-16
 * @author: Victor Woods
 * 
 */
package datebase.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/**
 * 
 * @ClassName: DatabaseUtil
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-16
 * @author: Victor Woods
 *
 */
public class DatabaseUtil {

	/**
	 * @Title: DatabaseUtil
	 * @Description: TODO
	 * @param: 
	 * @throws: 
	 *
	 */
	private static Properties p=null;
	static {
		InputStream instream=DatabaseUtil.class.getClassLoader().getResourceAsStream("db.properties");
		if(instream!=null) {
			p=new Properties();
			try {
				p.load(instream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public DatabaseUtil() {
		// TODO Auto-generated constructor stub
	}
	public static String getValue(String key) {
		return p.getProperty(key);
	}

}
