package com.nt.beans;

import java.util.Scanner;

class bankAccount{
  private String name;
  private String accno;
  private long  balance;
  
  // creating scanner for retriving data from the end user 
  Scanner sc= new Scanner(System.in);
  
   //creating method to open account
   void openAccount(){
     System.out.println(" Please Enter your NAme");
     name=sc.nextLine();
     System.out.println(" Please Enter your accountNUmber");
     accno=sc.nextLine();
     System.out.println(" Please Enter your INTAIL AMOUNT");
     balance=sc.nextLong();
     }
   // method to show Account
   void showAccount(){
	   System.out.println( name+"\n acountnumber"+accno+"\n balance"+balance);
       }
   // method to deposit the amount
   void Deposit(){
	   Long amt;
	   System.out.println("PLEASE ENTER YOUR AMOUNT");
	   amt=sc.nextLong();
	   balance=balance+amt;
	   System.out.println(" YOUR AMOUNT   DEPOSITED NOW "+ balance);
	   
   }
   // method to widthdraw the Amount
    void withdrawAmount(){
    	Long amt;
    	System.out.println("PLEASE  ENETER THE WITHDRAWL AMOUNT");
    	amt=sc.nextLong();
    	if(balance>=amt)
    	{
    		balance=balance-amt;
    	}
    	else 
    		System.out.println(" INSUFFECIENT AMOUNT");
         }
   
    //method to search the account
    boolean search(String accn){
    	if(accn.equalsIgnoreCase(accno)) {
    		showAccount();
    		return(true);
    	}
    	else return(false);
 }

}
