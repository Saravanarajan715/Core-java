package com.demo;


interface abc
{ 
	public void print_abc(); 
}  
interface xyz{ 
	public void print_xyz();  
}  
interface pqr extends abc, xyz
{ 
	public void print_PQR();
}  
class children implements pqr
{ 
	public void print_abc() 
	{
		System.out.println("Happy"); 
	} 
	public void print_xyz() 
	{ 
		System.out.println("Birthday"); 
	} 
	public void print_pqr() 
	{ 
		System.out.println("To You");
	}
	@Override
	public void print_PQR() {
		// TODO Auto-generated method stub
		
	}
}
public class Vss
{  
	public static void main(String[] args) 
{ 
		children d = new children(); 
		d.print_abc(); 
		d.print_xyz(); 
		d.print_pqr();  
} 
	
}


