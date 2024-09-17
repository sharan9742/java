package datatypes.javaprograms;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
    		    Scanner sc = new Scanner(System.in);
    	        System.out.println("Enter month:");
    	        String month = sc.nextLine().toLowerCase(); 

    	        switch (month) {
    	            case "jan":
    	            case "mar":
    	            case "may":
    	            case "jul":
    	            case "aug":
    	            case "oct":
    	            case "dec":
    	                System.out.println("31 days");
    	                break;
    	                
    	            case "apr":
    	            case "jun":
    	            case "sep":
    	            case "nov":
    	                System.out.println("30 days");
    	                break;

    	            case "feb":
    	                System.out.println("28 or 29 days (leap year dependent)");
    	                break;

    	            default:
    	                System.out.println("Invalid month entered.");
    	        }
    	        
    	        sc.close();
    	    }
    	}
