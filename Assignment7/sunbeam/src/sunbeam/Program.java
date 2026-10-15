package sunbeam;

import java.util.*;

class Book {
	private String isbn;
	private String authorName;
	private double price;
	private int quantity;

	public Book() {

	}

	public Book(String isbn, String authorName, double price, int quantity) {
		this.isbn = isbn;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;

	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthorName() {
		return authorName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String toString() {
		return "isbn: " + isbn
                + ", Author Name: " + authorName
                + ", Quantity: " + quantity
                + ", Price: " + price;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Book other = (Book) obj;
		return this.isbn == other.isbn;

	}

}

enum Arithmetic{
	Exit,ADD,DISPLAYF,DISPLAYB,DELETE,SORT;
}


public class Program {

	public static Scanner sc = new Scanner(System.in);
	public static List<Book> list = new ArrayList<>();

	
	public static void acceptRecord() {
		Book bk = new Book();
		System.out.println("Enter book Detials : ");
		System.out.println("Enter isbn : ");
		String isbn = sc.next();
		bk.setIsbn(isbn);
		
		System.out.println("Enter AuthorName : ");
		String authorName = sc.next();
		bk.setAuthorName(authorName);
		
		System.out.println("Enter Book Price : ");
		double price = sc.nextDouble();
		bk.setPrice(price);
		
		System.out.println("Enter Book Quantity : ");
		int quantity = sc.nextInt();
		bk.setQuantity(quantity);
		
		addBook(bk);
		
	}
	
	
	public static void addBook(Book newBook) {
	
		list.add(newBook);
	}
	
	public static void displayForward() {
	 ListIterator<Book> trav = list.listIterator();
	 while(trav.hasNext()) {
		 Book ele = trav.next();
		 System.out.println(ele);
	 }
	}
	 
	 public static void displayReverse() {
		 ListIterator<Book> trav = list.listIterator(list.size());
		 while(trav.hasPrevious()) {
			 Book ele = trav.previous();
			 System.out.println(ele);
		 }
	}
	 
	 public static void removeRecord() {
		 Book key = new Book();
		 System.out.println("Enter the isbn of Book");
		 String e = sc.next();
		 key.setIsbn(e);
		
		 if(list.contains(key)) {
		 list.remove(key);
	 }
	 }
	public static void printBook() {
		for(Book bk : list) {
			System.out.println(bk.toString());
		}

	}
	
		
	
	
	public static void main(String[] args) {
		
		Arithmetic[] arVal = Arithmetic.values();
		for(Arithmetic ar : arVal) {
			System.out.println(ar.ordinal() + "." + ar.name());
		}
		System.out.println("Enter the choice : ");
		int index = sc.nextInt(); // 3 
		Arithmetic choice = arVal[index];
		
			switch(choice) {
			
			case ADD:
				Program.acceptRecord();
				Program.printBook();
				break;
			case DISPLAYF:
				Program.displayForward();
				break;
			case DISPLAYB:
				Program.displayReverse();
				break;
			case DELETE:
				Program.removeRecord();
				break;
			case SORT:
				Comparator<Book> comparator = null;
			 comparator = new SortBySalary();
			list.sort(comparator);
			Program.printBook();
			}
			
		}
		
	}


