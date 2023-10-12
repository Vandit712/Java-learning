package Javademo;

public class Con_para {
	int dob;
	String name;
	public Con_para(int date, String myname){
		dob= date;
		name= myname;
	}
	public static void main(String[]args){
		Con_para myob = new Con_para(07,"vandit");
		System.out.println("Date of birth is : "+myob.dob + "  Name is "+myob.name);
	}
}
