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
import java.util.Scanner;

public class Scenario_2_1 {

	public static void main(String[] args)throws IOException {
			
		String Sample=" <from_account><institution_name>FNB,South Africa</institution_name><swift>FIRNZAFF</swift><branch>22548</branch><account>4483812254886559</account><currency_code>ZAR</currency_code><account_name>FIRST NATIONAL CHEQUE PREMIER ACCOUNT</account_name><client_number>28248582</client_number><personal_account_type>20</personal_account_type><signatory><t_person><gender>M</gender><title>Mr</title><firstnumber>890128522079</id_number><nationality1>ZA</nationality1><residence>ZA</residence></signatory></from_account>"  ;
  
		String s2 = "Full Name: Mr MOHAMMED NABEEL CAMAROODIEN\r\n" + "Date of Birth: 28 January 1989 ";
		
		
		
		
		System.out.println("Sample "  + "\r\n" + Sample +  "\r\n"  );
		
		System.out.println("Final : ");
		System.out.println(Sample.replace(Sample, s2) +"  "); 

		 Scanner ID = new Scanner(System.in);  
		    System.out.println("Enter ID Number ");

		    String userName = ID.nextLine();  
		    
		    
		    
		    
		    if (userName.length() != 13) { 
			    System.out.println("ID Number : " + userName + "  Is inavlid " );  
			    
			    
		    }  else{
	System.out.println("ID number is  Valid" );    	
		    }
		
		
		}}  
		


	



