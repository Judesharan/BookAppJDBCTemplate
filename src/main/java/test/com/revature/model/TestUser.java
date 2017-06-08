package test.com.revature.model;

import com.revature.model.User;

public class TestUser {
	
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(101);
		user1.setName("Sharan");
		user1.setUserName("sharan7797");
		user1.setPassword("sharan123");
		user1.setMobileNumber(9876549876l);
		user1.setEmailID("sharan@gmail.com");
		user1.setActive("A");
		user1.setRoleId(100);
		
		System.out.println("ID = " + user1.getId());
		System.out.println("Name = " + user1.getName());
		System.out.println("UserName = " + user1.getUserName());
		System.out.println("Password = " + user1.getPassword());
		System.out.println("Mobile Number = " + user1.getMobileNumber());
		System.out.println("Email ID = " + user1.getEmailID());
		System.out.println("Active = " + user1.getActive());
		System.out.println("Role ID = " + user1.getRoleId());
		
	}
}
