



// Created by Developer UmairAsad on 19/November/2021
//Time 5:37pm Friday

import java.util.Scanner;
public class LinkedList {

	
	//creating the object of scanner
	Scanner input=new Scanner(System.in);
	
	Node header;//points the first node
	Node p;//a temporary reference to make things easier
	
	//A flag variable to control the looping inside functions
	int flag;
    
	//---------------------------------------------------------
	//this will insert the node at the end
	void insert_at_end()
	{
		
		Node temp=new Node();//creating new node
		header=temp;//assigning the reference of first node to header 
		p=temp;//assigning the reference of node to p
		
		
		//this will loop again and again until you want values from user
		do {
			
			//getting vales from user
			System.out.println("Enter the value");
			int val=input.nextInt();
			//placing values in node along with references
			temp.value=val;
			temp.next=null;
			//moving p to same reference as temp
			p=temp;
			
			//asking user if he/she wants to create another node
			System.out.println("Do you want to create another node 1 for yes and 0 for no");
			flag=input.nextInt();
			if(flag==1)
			{
			    temp=new Node();//creating new node
			    p.next=temp;//storing the address of new node inside next part of previous node    
			}
			
		}while(flag==1);
		//end loop
		
	}
	//end function
	//---------------------------------------------------------
	
	
	
	
	
	//---------------------------------------------------------
	//this function will delete the values from the end of linked list
	void delete_from_end()
	{
		
		//This will continue looping and deleting values until user wants
		do {
			
			Node temp=header;
			Node p=temp.next;
			while(p.next!=null)
			{
				p=p.next;
				temp=temp.next;
			}
			System.out.println("The deleted value is "+ p.value);
			p=null;//deleting the last node object
			
			temp.next=null;//assigning null to second last node
			System.out.println("Do you want to delete more values from end of linkedlist");
			flag=input.nextInt();
		}while(flag==1);
		
		//end loop
	}
	
	//end function
	//---------------------------------------------------------
	
	
	
	
	
	//---------------------------------------------------------
	//this will show the values inside the linked list
	void show()
	{
		Node temp=this.header;//getting the reference of header inside temp
		while(temp.next!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
		System.out.println(temp.value);
	}
	
	
	//----------------------------------------------------------
	//This function will insert node and value at start of linked list
	void insert_at_start()
	{
		
		do
		{
		
			
				Node p=header;//assigning reference of head node to p
				Node temp=new Node();//creating new node
				//getting value from user
				int val;
				System.out.println("Enter the value");
				val=input.nextInt();
				
				//assignments in new node
				temp.value=val;
				temp.next=p;
				header=temp;
				System.out.println("The inserted value is "+ header.value);
				System.out.println("Want to enter new value");
				flag=input.nextInt();
			
			
		}while(flag==1);
			
		
	}
	//end function
	//---------------------------------------------------------
	
	
	
	//-------------------------------------------------------
	//This function will delete values from start of linked list
	void delete_from_start()
	{
		
		do
		{
			Node temp=header;
			Node p=header.next;
			temp.next=null;
			header=p;
			System.out.println("The deleted value is "+ temp.value);
			temp=null;
			System.out.println("Want to delete more press 1 or 0 to terminate");
			flag=input.nextInt();
		}while(flag==1);
		
	}
	//end function
	//---------------------------------------------------------------
 }
//end class
