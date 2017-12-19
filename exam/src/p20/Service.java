package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {
	
	DBCon dbcon;
	Service(){
		dbcon = new DBCon();
	}
	public int updateClassInfo(LinkedHashMap<String,Object> hm) {
		int result=0;
		String sql ="update class_info\r\n" + 
				"set cidesc= ?\r\n" + 
				"where cino=?";
		try {
			result=dbcon.executeUpdate(sql ,hm);
			dbcon.commit();
			try {
				dbcon.rollback();
			}catch(SQLException e) {
			e.printStackTrace();
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int insertClassInfo(LinkedHashMap<String,Object> hm) {
		int result=0;
		String sql ="insert into class_info(cidesc,ciname) "+
					" values(?,?) ";
			try {
				result=dbcon.executeUpdate(sql,hm);
				dbcon.commit();
				try {
					dbcon.rollback();
				}catch(SQLException e) {
					e.printStackTrace();
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return result;
	}
	public int deleteClassInfo(LinkedHashMap<String,Object> hm) {
		int result =0;
		String sql = "delete from class_info "+
					" where cino =? ";
		try {
			result= dbcon.executeUpdate(sql , hm);
			try {
				dbcon.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public void selectClassInfo(LinkedHashMap<String,Object> hm) {
		int result=0;
		ArrayList<HashMap<String,Object>> objList;
		String sql = "select *from class_info where cino = ?";
		try {
			objList= dbcon.executeQuery(sql , hm);
			for(HashMap<String, Object> list:objList) {
				System.out.println(list);
			}
			try {
				dbcon.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
