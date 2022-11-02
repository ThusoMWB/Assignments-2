import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Scenario_1_1 {

	public static void main(String[] args)throws IOException {
		

	    List<String> strings = Arrays.asList(
	    		"Jungle Oats | R44.99 |", 
				"Cape Point Fish Finger | R64.99 |",
				"Bokomo Corn Flakes | R37.99 |"  , 
				"Bob Martin | R169.99 |"
				, "Tastic Rice | R50.00|", 
			     	"Yum Yum | R44.99 |"   );

	    Collections.sort(strings, new Comparator<String>() {
	        public int compare(String o1, String o2) {   
	            return extractInt(o1) - extractInt(o2);
	         
	        }

	        int extractInt(String s) {
	            String num = s.replaceAll("\\D", "");

	            return num.isEmpty() ? 0 : Integer.parseInt(num);
	        }
	    });
	    System.out.println(strings.get(0));
	}
}

