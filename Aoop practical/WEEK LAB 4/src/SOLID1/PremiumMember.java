package SOLID1;

public class PremiumMember extends Member {
	public PremiumMember(String name, String memberId) {
		super(name, memberId);
		
	}
	public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailability(false);
            System.out.println(getName() + " borrowed " + book.getTitle() + " with priority.");
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }
    public void returnBook(Book book) {
        book.setAvailability(true);
        System.out.println(getName() + " returned " + book.getTitle());
    }
}
