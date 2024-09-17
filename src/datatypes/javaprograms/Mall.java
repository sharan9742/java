package datatypes.javaprograms;

public class Mall {

	public static void main(String[] args) {
		System.out.println("Enter the price of the product:");
		float price = 2660;
		float dis;	
	float finalPrice;
		if (price >= 1000 && price < 2000)
		{
		    System.out.println("You have a 5% discount on your product:");
		    dis = price*5/100;
		    System.out.println("Discount: " + dis);
		    finalPrice = price - dis;
		    System.out.println("Final price: " + finalPrice);
		}
		else if (price >= 2000 && price < 4000)
		{
		    System.out.println("You have a 5% discount on your product:");
		    dis = price*7/100;
		    System.out.println("Discount: " + dis);
		    finalPrice = price - dis;
		    System.out.println("Final price: " + finalPrice);
		}
		else if (price >= 4000 && price < 8000)
		{
		    System.out.println("You have a 5% discount on your product:");
		    dis = price*10/100;
		    System.out.println("Discount: " + dis);
            finalPrice = price - dis;
		    System.out.println("Final price: " + finalPrice);
		}

	}

}
