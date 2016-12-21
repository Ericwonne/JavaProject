import java.util.*;



public class User {
	
	private String ID;//身份证
	private String MID;//就诊号
	private String AID;//预约号
	private String name;
	private String sex;
	private int age;
	private String address;
	private String phone;
    private int valid;     //预约是否有效
	private String deptid;
	private String docid;
	private String desc;
	private String diag;
	private String med;
	private String chargeitem;
	private float cost;
	private int state;
	private Date aptime;   //预约时间
	private Date subtime;  //预约提交时间
	private Date regtime;   //挂号完成时间
	private Date chargetime;  //缴费完成时间
	private Date finishtime;   //取药完成时间
	
	
	
	public User(){
		super();
	}
	
	
	
	//用户信息构造函数
	public User(String ID,String name,String sex,int age,String address,String phone){
		this.ID=ID;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.address=address;
		this.phone=phone;
		}
	//预约信息构造函数
	public User(String AID,String ID,String name,String sex,int age,String address,String phone,String deptid,Date aptime,Date subtime,int valid){
		this.AID=AID;
		this.ID=ID;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.address=address;
		this.phone=phone;
		this.deptid=deptid;
		this.aptime=aptime;
		this.subtime=subtime;
		this.valid=valid;
	}
	//就诊信息构造函数
	public User(String MID,String ID,String name,String sex,int age,String address,String phone,String deptid,String docid,Date regtime,String chargeitem,int state){
		this.MID=MID;
		this.ID=ID;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.address=address;
		this.phone=phone;
		this.deptid=deptid;
		this.docid=docid;
		this.regtime=regtime;
		this.chargeitem=chargeitem;
		this.state=state;
		
	}
	
	public String getID(){
		return ID;
	}
	
	public void setID(String ID){  
		this.ID=ID;
	}
	
	public String getMID(){
		return MID;
	}
	
	public void setMID(String MID){  
		this.MID=MID;
	}
	public String getAID(){
		return AID;
	}
	
	public void setAID(String AID){  
		this.AID=AID;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){  
		this.name=name;
	}
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){  
		this.sex=sex;
	}
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){  
		this.age=age;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){  
		this.address=address;
	}
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){  
		this.phone=phone;
	}
	public Date getAptime(){
		return aptime;
	}
	
	public void setAptime(Date aptime){  
		this.aptime=aptime;
	}
	public Date getSubtime(){
		return subtime;
	}
	
	public void setSubtime(Date subtime){  
		this.subtime=subtime;
	}
	public int getValid(){
		return valid;
	}
	
	public void setValid(int i){  
		this.valid=i;
	}
	public Date getRegtime(){
		return regtime;
	}
	
	public void setRegtime(Date regtime){  
		this.regtime=regtime;
	}
	public String getDeptid(){
		return deptid;
	}
	
	public void setDeptid(String deptid){  
		this.deptid=deptid;
	}
	public String getDocid(){
		return docid;
	}
	
	public void setDocid(String docid){  
		this.docid=docid;
	}
	public String getDesc(){
		return desc;
	}
	
	public void setDesc(String desc){  
		this.desc=desc;
	}
	public String getDiag(){
		return diag;
	}
	
	public void setDiag(String diag){  
		this.diag=diag;
	}
	public String getMed(){
		return med;
	}
	
	public void setMed(String med){  
		this.med=med;
	}
	public String getChargeitem(){
		return chargeitem;
	}
	
	public void setChargeitem(String chargeitem){  
		this.chargeitem=chargeitem;
	}
	public float getCost(){
		return cost;
	}
	
	public void setCost(float cost){  
		this.cost=cost;
	}
	public Date getChargetime(){
		return chargetime;
	}
	
	public void setChargetime(Date chargetime){  
		this.chargetime=chargetime;
	}
	public Date getFinishtime(){
		return finishtime;
	}
	
	public void setFinishtime(Date finishtime){  
		this.finishtime=finishtime;
	}
	public int getState(){
		return state;
	}
	
	public void setState(int state){  
		this.state=state;
	}
	
	
}
