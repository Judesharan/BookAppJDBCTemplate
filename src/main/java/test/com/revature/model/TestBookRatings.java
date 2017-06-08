package test.com.revature.model;

import com.revature.model.BookRatings;

public class TestBookRatings {
	public static void main(String[] args) {
		
		BookRatings bookratings1 = new BookRatings();
		bookratings1.setIsbn(9788700631625l);
		bookratings1.setUserID(101);
		bookratings1.setRating(4.5);
		
		System.out.println("ISBN = " + bookratings1.getIsbn());
		System.out.println("User ID = " + bookratings1.getUserID());
		System.out.println("Ratings = " + bookratings1.getRating());
	}
}
