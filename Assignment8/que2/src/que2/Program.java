package que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Green");
		list.add("yellow");
		list.add("Red");
		
		Collections.sort(list);
		
		for(String c : list) {
			System.out.println(c);
		}
	}
}
