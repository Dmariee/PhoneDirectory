package main.java;
import java.io.*;
import java.util.*;

public class PhoneDirectory {
  //Used hashtable because it has unique identifier "key"
  public static Dictionary<String, String> dict = new Hashtable<String, String>(); 
  //Built in functions for hashtable allow you to access data in it 
  public static void printDirectory()
  {
	  System.out.println(dict); //prints directory
  } 
  public static void addEntry(String name, String number)
  {
	  dict.put(name, number); //adds a value/user to directory
  }  
  public static void deleteEntry(String name)
  {
	  dict.remove(name); //removes a user from directory
  }
  public static String getNumber(String name)
  {
	  return dict.get(name); //returns the phone number of the given user
  }
  public static	void changeEntry(String name, String number)
  {
	  dict.put(name, number); //changes the phone number of the user entered
  }
  //function to write the directory to a file for viewing
  public static void write_to_file()
  { 
	  try //needed when dealing file input to make sure program doesnt crash
	  {	
		  //Location of the output file that is being written to
		  File file = new File("src/main/test/output.txt");
		  // if file doesnt exists, then exit becuase there no file to write to
		  if (!file.exists())
		  {
			  return;
		  }
		  //Filewriter is type to write to file needs to be wrapped
		  //in a bufferwriter to do line insertion into the file 
		  FileWriter file_add = new FileWriter(file.getAbsoluteFile());
		  //wrapper of filewriter for effective input into file
		  BufferedWriter file_wrapped = new BufferedWriter(file_add); 
		  //Goes through the hashtable as iteration to print the values
		  for (Map.Entry<String, String> entry : ((Hashtable<String, String>) dict).entrySet()) 
		  {
			  String key = entry.getKey();
			  String value = entry.getValue();
			  file_wrapped.write( key + " " + value + "\n");
		  }
		  file_wrapped.close(); //Close the file to prevent corruption
		  System.out.println("Done");
	  } 
  		catch (IOException e)//Catch the error to stop program 
  		{
  			e.printStackTrace();
  		}
  	}  
}


