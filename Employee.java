package org.jclass.main;


class Employee {
	
	/*Create a class Employee.java with attributes empNo, empName, address, State,
	zipCode, phone, designation (manager, lead, analyst) , experienceinYears,
	emailAddress, basic, hra, bonus (% of basic). Choose appropriate data types and
	create a constructer, getters &amp; setters for the attributes. Also create a method to
	return the total salary (basic + hra + (bonus/100)*basic)*/
	
	private
		int empNo;
		String empName;
		String address;
		String state;
		String zipcode;
		String phone;
		String designation;
		String emailAddress;
		float experienceinYears;
		float basic;
		float hra;
		float bonus;
	public
	
	
	void setEmpNo(int eno){
		this.empNo= eno;
	}
	void setEmpName(String ename){
		this.empName= ename;
	}
	void setAddress(String adr){
		this.address= adr;
	}
	void setState(String stat){
		this.state= stat;
	}
	void setZipcode(String zcode){
		this.zipcode= zcode;
	}
	void setPhone(String ename){
		this.phone= ename;
	}
	void seEmailAddress(String ename){
		this.emailAddress= ename;
		
	}
	void setExperienceinYears(float n) {
		this.experienceinYears= n;
	
	}
	void setBasicHra(float ba, float hra) {
		this.basic= ba;
		this.hra=hra;
		this.bonus=ba*(10/100);
	
	}
	
	int getEmpNo(){
		return(this.empNo);
	}
	String getEmpName(){
		return(this.empName);
	}
	String getEmpNo(String adr){
		return(this.address);
	}
	String getState(String stat){
		return(this.state);
	}
	String getZipcode(String zcode){
		return(this.zipcode);
	}
	String getPhone(String ename){
		return(this.phone) ;
	}
	String getEmailAddress(String ename){
		return(this.emailAddress);
		
	}
	float getExperienceinYears(float n) {
		return(this.experienceinYears);
	
	}
	float getBasic() {
		return(this.basic);
	}
	float getHra() {
		return(this.hra);
	}
	float getBonus() {
		return(this.bonus);
	}	
		
	float tSalary()
	{
		float totSal=getBasic() + getHra() + (getBonus()/100)*getBasic();
		return totSal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.setEmpName("Lija");
		e.setBasicHra(4000, 200);
		System.out.println(e.getEmpName()+" is getting a monthly pay of "+ e.tSalary() );
	}

}
