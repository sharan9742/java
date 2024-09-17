package datatypes.javaprograms;

public class Count {

	public static void main(String[] args) {
		        int start = 100;
		        int stop = 200;
		        int count = 0; 
		        
		        for (int num = start; num <= stop; num++) {
		            if (num % 5 == 0) {
		                count++; 
		            }
		        }
		        
		        System.out.println("Total numbers divisible by 5 between " + start + " and " + stop + ": " + count);
		    }
		}


	


