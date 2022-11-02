import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Scenario_1_2 {

	public static void main(String[] args)throws IOException {

		
    	
        Date date = new Date();
		  Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		    
		    
		    
		   cal.add(Calendar.MONTH, 1);

		   java.util.Date expirationDate = cal.getTime();

		  


				
		    String[][] data = {
		    	    {"Jungle Oats |", "", "Mon, 10 Nov 2022     00:00:00 GMT"},
		    	    {"Cape Point Fish Finger |", "    ", "Mon, 05 Dec 2022     00:00:00 GMT"},
		    	    {"Bokomo Corn Flakes	|", "", "Mon, 06 Aug 2022     00:00:00 GMT"},
		    	    {"Bob Martin|", "", "Mon, 25 Feb 2023    00:00:00 GMT"},
		    	    {"Tastic Rice |", "      ", "Mon, 17 Jul 2023   00:00:00 GMT"},
		    	    {"Yum Yum |", "    ", "Mon, 05 Sep 2022    00:00:00 GMT"},
		    	      
		    	   
		    	};
		    
		    Arrays.sort(data, new Comparator<String[]>() { 
		        SimpleDateFormat f = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");


		        
		        
		        @Override
		        public int compare(String[] o1, String[] o2) {
		        	
    try {
    	
    	if(f.parse(o1[2]).before(expirationDate)  ) {
    		
    	Date date2 = f.parse(o2[2]) ; 
		  
		    		    for(int i = 0; i < data.length; i++){

		    		        for(int j = 0; j < data[i].length; j++)
		    		        {
		    		            System.out.print(data[i][j]);
		    	
		    		            if(j < data[i].length - 1) System.out.print(" ");
		    		            
		    		    		System.out.println("Expiring Items " +date2);
		    		    		
		    		    		
		    		          	
				                return f.parse(o1[2]).compareTo(f.parse(o2[2]));
		            	} } }
    	
    	else {

    	}
    	}
    
    catch (ParseException e) {
		                e.printStackTrace();
		            }
		            return -1;
	
		        }
		    });
	}
}



