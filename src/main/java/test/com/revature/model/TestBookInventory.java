package test.com.revature.model;

import com.revature.model.BookInventory;

public class TestBookInventory {
	public static void main(String[] args) {
		
		BookInventory bookInventory1 = new BookInventory();
		bookInventory1.setIsbn(9788700631625l);
		bookInventory1.setQuantity(5);
		
		System.out.println("ISBN = " + bookInventory1.getIsbn());
		System.out.println("Quantity = " + bookInventory1.getQuantity());
	}

}
