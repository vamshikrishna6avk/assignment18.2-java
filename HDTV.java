package collectioncomparator;//creaed package name as collectioncomparator

/**
 * Cretaed a class named HDTV
 *
 */

public class HDTV  {//Here public is a access modifier which defines who can access this method
	String brand;
	int size;
	//Created getters and setters
 public int getSize() {
		return size;//returns size
	}

	public void setSize(int size) {
		this.size = size;
	}
//Created a constructor and initialize it
public HDTV(String brand,int size){//Here public is a access modifier which defines who can access this method
	 this.brand=brand;
	 this.size=size;
	 
}
//Here we have toString method it will returns the string representation of the object
public  String toString(){//Here public is a access modifier which defines who can access this method
return "shorted as per size of TV samsung"+size;//returns
}
}

