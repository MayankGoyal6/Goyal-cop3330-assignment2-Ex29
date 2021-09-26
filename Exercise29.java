/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 29
 *  Copyright 2021 Mayank Goyal
 */

import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner scanner =new Scanner(System.in);
    
    boolean flag=false;
      while(true)
      {
        try
        {
          System.out.print("What is the rate of return? "); 
          int r=Integer.parseInt(scanner.next()); 

          int years = (72/r);

          System.out.println("It will take " + years + " years to double your initial investment.");
          flag=true; 
        }
        catch(ArithemticException e) 
        {

          System.out.println("Sorry. That's not a valid input"); 
           
        }
        catch(NumberFormatException e) 
        {

          System.out.println("Sorry. That's not a valid input");   

        }
        if(flag) 
        {
               
          break;

        }
           
       }
    }
}
