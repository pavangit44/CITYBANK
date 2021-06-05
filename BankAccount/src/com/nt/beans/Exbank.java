package com.nt.beans;

import java.util.Scanner;
public class Exbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating the scanner class
		Scanner sc=new Scanner(System.in);
		
		 //creating intail  Accounts
		System.out.println("how many accoutns you want to release");
		int n= sc.nextInt();
		bankAccount ba[] =new bankAccount[n];
		
		for(int i=0;i<ba.length; i++) {
			System.out.println("Enter the details of-------"+(i+1)+"---- user");
			ba[i]=new bankAccount();
			 ba[i].openAccount();
		}
		int ch;
		do {
			System.out.println("PLEASE ENTER THE OPTION  U WANT\nMain Menu\n1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5.Exit ");
			System.out.println("Ur Choice :"); 
			ch=sc.nextInt();
		switch(ch){
			case 1:
				 for(int i=0; i<ba.length;i++) {
					 ba[i].showAccount();
				 }
			case 2:
				System.out.println("ENTER THE ACCOUNT NUMBER U WANT SEARCH");
			    String	accn=sc.next();
				boolean found=false;
				 for(int i=0;i<ba.length;i++) {
					 ba[i].search(accn);
					 if(found) {
						 break;
					 } 
				 }
				 if (!found) {
                     System.out.println("Search Failed..Account Not Exist..");
                 }
                 break;
				 
			case 3:
				System.out.println("ENTER THE ACOUNT NUMBER YOU WANT TO DEPOSIT");
			    accn=sc.next();
				found=false;
				for(int i=0; i<ba.length; i++) {
					ba[i].search(accn);
					if(!found){
						ba[i].Deposit();
					}
				} if (found) {
                    System.out.println("Search Failed..Account Not Exist..");
                }
                break;
				
			case 4:
				System.out.println("ENTER THE ACCOUNT U WANT TO drww  ");
				accn=sc.next();
				found=false;
				for(int i=0; i<ba.length; i++) {
					ba[i].search(accn);
					if(!found) {
						ba[i].withdrawAmount();
					}
				}if(found) {
					System.out.println("Search Failed..Account Not Exist..");
                }
                break;
			case 5:
				System.out.println("THANKS FOR THE VISIT GOOD BYE");
				break;
		}
		}
		while(ch!=5);
	}

}
