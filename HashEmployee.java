package collectiondemos;

//Here we import HashMap , Map Class
import java.util.HashMap;
import java.util.Map;
import java.util.*;

//create HAshEmployee class to store Empcode, EmpName
public class HashEmployee {

	public static void main(String args[]) {
		// Here we make object of HashMap Class and pass two parameters
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// insert data into hash
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		// Display only EmpNames as output
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getValue());
		}
	}
}
