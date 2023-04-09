package searchElement;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchElement{
	public static void main(String[] args){
		ArrayList<String> emailID = new ArrayList<String>();
		    emailID.add("bharat@dev.in");
		    emailID.add("maria@dev.in");
		    emailID.add("manju@dev.in");
		    emailID.add("sneha@dev.in");
		    emailID.add("rani@dev.in");
		    emailID.add("vani@dev.in"); 
  
		    String searchElement = null;
		    System.out.println("Enter the email to search");
			   try (Scanner sc = new Scanner(System.in)) {
			    searchElement = sc.nextLine();
			   }
			   if(searchElement == null){
				   System.out.println("you haven't entered an email");
			   return;
			   }
			   
			   for(int i=0; i < emailID.size();i++){
			    //System.out.println(emailID.get(i));
				    if(searchElement.equals(emailID.get(i))){
				    	System.out.println("emailID" +searchElement+ "found");
				    break;
				   }
				    
			   }
		}
}