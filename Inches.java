package collectioncomparator;//creaed package name as collectioncomparator

import java.util.Comparator;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
/**
 * Created a class Inches it implements comparator 
 *
 */
public class Inches implements Comparator<HDTV> {//Here public is a access modifier which defines who can access this method
	//as we are sorting based on integer we only need Compare method 
public int compare(HDTV TV, HDTV TV1){//Here public is a access modifier which defines who can access this method
	//logic for sorting
 if(TV.getSize()<TV1.getSize()){//getssize
	 return -1;
 } else{
	return 1;//returns
 }
}
}
