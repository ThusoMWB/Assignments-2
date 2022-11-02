import java.io.IOException;
import java.util.Scanner;

public class Scenario_2_2 {

	public static void main(String[] args)throws IOException {

		String Sample=" <from_account><institution_name>FNB,South Africa</institution_name><swift>FIRNZAFF</swift><branch>22548</branch><account>4483812254886559</account><currency_code>ZAR</currency_code><account_name>FIRST NATIONAL CHEQUE PREMIER ACCOUNT</account_name><client_number>28248582</client_number><personal_account_type>20</personal_account_type><signatory><t_person><gender>M</gender><title>Mr</title><firstnumber>890128522079</id_number><nationality1>ZA</nationality1><residence>ZA</residence></signatory></from_account>"  ;
		String Conn = "" ; 
		
		Conn = Sample.substring(33, 36) ;
		Conn = 	Conn + Sample.substring(122, 138) ; 
		Conn = 	Conn + "_" ; 
		Conn = 	Conn + Sample.substring(217, 225) ; 
					

	
			      System.out.println(Conn );
			   }
	
		
		
		    }
	

	
