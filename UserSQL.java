import java.awt.EventQueue;
import java.sql.*;

import java.util.*;
import java.util.Date;


public class UserSQL {
	
		
	//根据就诊号就诊号mid，查询某个用户信息，返回一个user对象
	public static User getUser(String mid){
		String sql="select * from UserMedicalHistory where mid='"+mid+"'";
		ResultSet rs=SQL.executeQuery(sql);
		User user=null;
		try {
			if(rs.next()){
				
				user=new User();
				user.setMID(rs.getString("mid"));
				user.setID(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setAge(Integer.parseInt(rs.getString("age")) );
				user.setAddress(rs.getString("address"));
				user.setPhone(rs.getString("phone"));
				
				user.setDeptid(rs.getString("deptid"));
				user.setDocid(rs.getString("docid"));
				user.setDesc(rs.getString("desc"));
				user.setDiag(rs.getString("diag"));
				user.setChargeitem(rs.getString("chargeitem"));
				user.setCost(Float.parseFloat(rs.getString("cost")));
				user.setState(Integer.parseInt(rs.getString("state")));
				
				user.setAptime(Timestamp.valueOf(rs.getString("aptime")));
				user.setRegtime(Timestamp.valueOf(rs.getString("regtime")));
				user.setChargetime(Timestamp.valueOf(rs.getString("chargetime")));
				user.setFinishtime(Timestamp.valueOf(rs.getString("finishtime")));}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SQL.close();
		return user;
		
	}
	
	
	//根据查询语句sql，查询符合条件的一组用户，返回arraylist<user>对象
	public static ArrayList<User> getUserList(String sql){
		ArrayList<User> list=new ArrayList<User>();
		ResultSet rs=SQL.executeQuery(sql);
		User user=null;

		try {
			while(rs.next()){
				
				user=new User();
				user.setMID(rs.getString("mid"));
				user.setID(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setAge(Integer.parseInt(rs.getString("age")) );
				user.setAddress(rs.getString("address"));
				user.setPhone(rs.getString("phone"));
				
				user.setDeptid(rs.getString("deptid"));
				user.setDocid(rs.getString("docid"));
				user.setDesc(rs.getString("desc"));
				user.setDiag(rs.getString("diag"));
				user.setChargeitem(rs.getString("chargeitem"));
				user.setCost(Float.parseFloat(rs.getString("cost")));
				user.setState(Integer.parseInt(rs.getString("state")));
				
				user.setAptime(Timestamp.valueOf(rs.getString("aptime")));
				user.setRegtime(Timestamp.valueOf(rs.getString("regtime")));
				user.setChargetime(Timestamp.valueOf(rs.getString("chargetime")));
				user.setFinishtime(Timestamp.valueOf(rs.getString("finishtime")));
				list.add(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SQL.close();
		return list;
	}
	
	
	//根据预约号aid，查询预约信息
	public static User getUserByAid(String aid){
		String sql="select * from UserAppointment where aid='"+aid+"'";
		ResultSet rs=SQL.executeQuery(sql);
		User user=null;
		try {
			if(rs.next()){
				
		     
				user=new User();
				user.setAID(rs.getString("aid"));
				user.setID(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setAge(Integer.parseInt(rs.getString("age")) );
				user.setAddress(rs.getString("address"));
				user.setPhone(rs.getString("phone"));
				user.setAptime(Timestamp.valueOf(rs.getString("aptime")));
				Date now=new Date(System.currentTimeMillis());
				if(Timestamp.valueOf(rs.getString("aptime")).compareTo(now)>=0)
				{
					int i=1;
					user.setValid(i);
				}
				else
				{
					int i=0;
					user.setValid(i);	
				}
					
				//user.setRegtime(Timestamp.valueOf(rs.getString("time")));
				user.setDeptid(rs.getString("deptid"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SQL.close();
		return user;	
	}
	
	//根据身份证号id，查询一个用户的一组预约信息
		public static ArrayList getUserByid(String id){
			ArrayList list=new ArrayList();
			String sql="select * from UserAppointment where id='"+id+"'";
			ResultSet rs=SQL.executeQuery(sql);
			User user=null;
			try {
				while(rs.next()){
					user=new User();
					user.setMID(rs.getString("aid"));
					user.setID(rs.getString("id"));
					user.setName(rs.getString("name"));
					user.setSex(rs.getString("sex"));
					user.setAge(Integer.parseInt(rs.getString("age")) );
					user.setAddress(rs.getString("address"));
					user.setPhone(rs.getString("phone"));
					user.setAptime(Timestamp.valueOf(rs.getString("aptime")));
					user.setAge(Integer.parseInt(rs.getString("valid")) );
					user.setDeptid(rs.getString("deptid"));
					list.add(user);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SQL.close();
			return list;	
		}
		
		
//		public static Object[][] queryAp(String id)
//		{
//			Object[][] results=getApResult(UserSQL.getUserByid(id));
//			return results;
//			
//		}
//		
//		//将预约信息查询结果包装成Object[][],以用来绑定JTable
//		private static Object[][] getApResult(ArrayList list)
//		{
//			Object[][] resu=new Object[list.size()][5];
//			for(int i=0;i<list.size();i++)
//			{
//				User user=(User)list.get(i);
//				if(user.getValid()==1)
//				{
//				    resu[i][0]=user.getAID();
//					resu[i][1]=user.getName();
//					resu[i][2]=user.getSex();
//					resu[i][3]= Integer.toString(user.getAge());
//					resu[i][4]=SQL.executeQuery("select *from Dept where id='"+user.getDeptid()+"'");
//					//resu[i][5]=user.getAptime().toString();	
//				}	
//			}
//			return resu;
//		}
		
		public static Object[][] getApResult(String id)
		{
			ArrayList<User> list=new ArrayList<User>();
			String sql="select * from UserAppointment where id='"+id+"'";
			ResultSet rs=SQL.executeQuery(sql);
			User user=null;
			try {
				while(rs.next()){
					user=new User();
					user.setAID(rs.getString("aid"));
					user.setID(rs.getString("id"));
					user.setName(rs.getString("name"));
					user.setSex(rs.getString("sex"));
					user.setAge(Integer.parseInt(rs.getString("age")) );
					user.setAddress(rs.getString("address"));
					user.setPhone(rs.getString("phone"));
					user.setAptime(Timestamp.valueOf(rs.getString("aptime")));
					user.setValid(Integer.parseInt(rs.getString("valid")) );
					user.setDeptid(rs.getString("deptid"));
					list.add(user);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SQL.close();
			Object[][] resu=new Object[list.size()][6];
			for(int i=0;i<list.size();i++)
			{
				User user1=(User)list.get(i);
				if(user1.getValid()==1)
				{
			        resu[i][0]=user1.getAID();
				    resu[i][1]=user1.getName();
					resu[i][2]=user1.getSex();
					resu[i][3]=user1.getAge();
					String sql2="select * from Dept where id='"+user1.getDeptid()+"'";
					ResultSet rs2=SQL.executeQuery(sql2);
					try {
						if(rs2.next())
							resu[i][4]=rs2.getString("name");
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					resu[i][5]=user1.getAptime();
				}	
			} 
			return resu;
		}
		
		
	
}
