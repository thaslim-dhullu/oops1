package onesoft.course.day10OOPSCompostion;

public class UseLibrary {
	public static void main (String[]args) {
		Book b = new Book();
		b.name = "Soil Mechanics";
		b.author = "Punmia";
		b.validity = 3;
		b.stackNo = 6;
		Library lib = new Library();
		lib.name = "Jai Gopal Garodia";
		lib.location = "Anna Nagar";
		lib.capacity =6000;
		lib.isOnSunday = true;
		lib.book = b;
		System.out.println(lib.name+" "+lib.location+" "+lib.capacity+" "+lib.isOnSunday);
		System.out.println(lib.book.name+" "+lib.book.author+" "+lib.book.validity+" "+lib.book.stackNo);
	}
}
class Library {
	String name;
	String location;
	int capacity;
	boolean isOnSunday;
	Book book;
}
class Book {
	String name;
	String author;
	int validity;
	int stackNo;
}
