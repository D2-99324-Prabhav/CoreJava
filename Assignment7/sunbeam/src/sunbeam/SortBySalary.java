package sunbeam;
import java.util.*;
import sunbeam.Book;
public class SortBySalary implements Comparator<Book> {
	public  int compare(Book o1, Book o2) {
		
		return -Double.compare(o1.getPrice(),o2.getPrice());
	}
}
