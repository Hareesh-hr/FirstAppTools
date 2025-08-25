package com.nt.main;

/**
 * Hello world!
 */
public class App {
	
public  int arthmeaticCal(int x,int y) {
	return x+y;
}

    public static void main(String[] args) {
    	App a=new App();
    	int msg=a.arthmeaticCal(10,20);
    	System.out.println(msg);
    }
}
