/*
Angelia
12/01/18
CSCI 1015-W1S
Programming Assignment 11
Purpose of this program is to allow users to insert, edit, delete and view items
that they have inputted into the ArrayList. 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class angeliaPass11
{
   //Creating a global scanner to use across all methods 
   static Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      //Creating the ArrayList 
      ArrayList<String> names = new ArrayList<String>(20);
      int x;
      //Do/While loop that contains if and else if statements for calling the appropriate method in correlation with users menu choice
      do
      {
         x = displayMenu();
         
         if(x == 1)
         {
            names.add(addName(0));
         }
         else if(x == 2)
         {
            System.out.println("Enter a number to edit");
            names.set(nameLocation(), addName(1));
         }
         else if(x == 3)
         {
            System.out.println("Enter a number to delete");
            names.remove(nameLocation());
         }
         else if(x == 4)
         {
            displayList(names);
         }
         
     }while(x!=5);
   }
   
   //Method for displaying the program menu
   public static int displayMenu()
   {
      //Wanted to add an extra line above the menu just to make the output look less cluttered 
      System.out.println();
      System.out.println("Name List Menu\n"+
                         "1. Add a name\n"+
                         "2. Edit a name\n"+
                         "3. Delete a name\n"+
                         "4. Display names\n"+
                         "5. Quit");
      System.out.print("Enter Choice: ");
      int choice = sc.nextInt();
      sc.nextLine();
      return choice;
   }
   
   //Method that allows users to insert items into the ArrayList
   //Using a parameter, I used two if statements two give two different println options for edit and just adding a name
   public static String addName(int option)
   {
      if(option == 0)
      {
         System.out.println("Enter a name");
         String temp = sc.nextLine();
         return temp;
      }
      if(option == 1)
      {
         System.out.println("Enter a new name");
         String temp = sc.nextLine();
         return temp;
      }
      String incorrect = "Error";
      return incorrect;
    }
   
   //Method that allows users to choose the location of the item they wish to edit or delete
   public static int nameLocation()
   {
      int place = sc.nextInt();
      sc.nextLine();
      return place;
   }
   
   //Method for listing the items in the ArrayList
   public static void displayList(ArrayList<String> list)
   {  
      int index = 0;
      for(String x : list)
      {
         System.out.println("[" + (index++) + "] "+ x);
      }
   }
}