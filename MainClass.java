package collectioncomparator;//creaed package name as collectioncomparator
import java.util.ArrayList;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Create a class named MainClass it should contains  main method
 *
 */
public class MainClass  {
	public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		//Created an array-list
List<HDTV> list= new ArrayList<HDTV>();
		
		//By using add method we have added three objects of HDTV
	    list.add(new HDTV("Samsung",32));
	    list.add(new HDTV("Samsung",50));
	    list.add(new HDTV("Samsung",40));
	    
	    
	    //Calling the sort method from the collection class
	    Collections.sort(list,new Inches());
	    System.out.println("sorted based on length");//system is used to return code
        //out is a static member
	  	//Println is used to print text  and gives output
	    //Applying for-each loop
	    for(HDTV M:list){
	    	System.out.println(M);//system is used to return code
	        //out is a static member
		  	//Println is used to print text  and gives output

	}

	}
	}

	
	

	
