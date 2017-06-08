package test.com.revature.model;

import com.revature.model.Role;

public class TestRole {
	public static void main(String[] args) {
		Role role1 = new Role();
		
		role1.setId(200);
		role1.setRoleName("Author");
		
		System.out.println("ID = " + role1.getId());
		System.out.println("Role Name = " + role1.getRoleName());
	}
}
