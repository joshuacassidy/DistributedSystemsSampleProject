package ds.service2;

import java.util.ArrayList;

public class TodoList {

		//create an object of SingleObject
	   private static ArrayList<String> todoList = new ArrayList<>();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private TodoList(){}

	   //Get the only object available
	   public static  ArrayList<String> getInstance(){
	      return todoList;
	   }
	
}
