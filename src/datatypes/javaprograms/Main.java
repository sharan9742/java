package datatypes.javaprograms;

public class Main
{
	public static void main(String[] args) {
		int rent=500;
		int day=2;
		int time=19;
		
		if(day==1 && time>20) {
			System.out.println("the rent is");
			System.out.println(rent+200);
		}
	else if(day>1 && time>20) {
		System.out.println("the rent is");
		System.out.println(rent+100);
	}
	else {
		System.out.println(rent);
	}
		
	}
}

	

