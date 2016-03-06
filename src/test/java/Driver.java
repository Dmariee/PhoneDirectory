package test.java;

import main.java.*;
public class Driver {
	  public static void main(String[] args) 
	  {
		  System.out.println("----- Creating dictionary ----- \n");
		  //Testing the feature to add entries to the directory
		  PhoneDirectory.addEntry("Lorai Lola", "3011111111");
		  PhoneDirectory.addEntry("Sindey Barder", "3012222222");
		  PhoneDirectory.addEntry("Presetine Barder", "3013333333");
		  PhoneDirectory.addEntry("Carter Johnsop", "3014444444");
		  PhoneDirectory.addEntry("Darty Pleasant", "5555555555");
		  System.out.println("----- Dictionary contains ----- ");
		  //Testing printing of the values contained in the directory
		  PhoneDirectory.printDirectory();
		  //Testing the retrieval feature when given a key in directory
		  System.out.println("\n ----- Sydney's number is ----- "); 
		  System.out.println(PhoneDirectory.getNumber("Sindey Barder") + "\n");
		  //Testing data change feature (works similar to instantiation)
		  System.out.println("---- Sydney's new number is ----");
		  PhoneDirectory.changeEntry("Sindey Barder", "3010000000");
		  System.out.println(PhoneDirectory.getNumber("Sindey Barder") + "\n");
		  //Testing the retrieval feature when given a key not in directory
		  System.out.println("\n ----- Burts number is ----- "); 
		  System.out.println(PhoneDirectory.getNumber("Burt Tucker") + "\n");
		  //Testing deletion feature
		  System.out.println("---- Delete Lorai Lola from the dictionary ----");
		  PhoneDirectory.deleteEntry("Lorai Lola");
		  PhoneDirectory.printDirectory();
		  //End the program
		  System.out.println("\n ---- End program and write to file ---- ");
		  PhoneDirectory.write_to_file();
		  }
}
