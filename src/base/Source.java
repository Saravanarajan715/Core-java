package base;


import java.io.*;
import java.util.*;
import java.text.*; 
import java.math.*;
import java.util.regex.*;
class MiddleTriangle
{ 
	static void printPattern1(int n)
	{ 

		int i,j;           
		for(i=1;i<=n;i++)         { 
			for(j=1;j<=n-i;j++)           
			{ 
				System.out.print(" ");   
				} 
		for(j=1;j<=i;j++)
		{
			 System.out.print(i+" ");
			 }          
		     System.out.println( ); 
		} 
	}  
} 
public class Source { 
	public static void main(String[] args)
	{ 
	    Scanner in = new Scanner(System.in); 
        int a,b,c;
          a = in.nextInt();     
          b = in.nextInt(); 
          c = in.nextInt();    
          MiddleTriangle m=new MiddleTriangle(); 
          m.printPattern1(a); 
          m.printPattern1(b); 
          m.printPattern1(c); 
          
          
          } 
	        
		
					
		
	}

