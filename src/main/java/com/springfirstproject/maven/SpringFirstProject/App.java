package com.springfirstproject.maven.SpringFirstProject;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	Customers cs= new Customers();
    	cs.setId(1);
    	cs.setFullName("Suvash Khatiwada");
    	cs.setEmail("suvashkhatiwada@gmail.com");
    	
        //System.out.println( cs.toString() );
        
    }
}
