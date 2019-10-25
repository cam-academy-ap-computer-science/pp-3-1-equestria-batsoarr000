
public class Equestria {
// main distance will first subtract the the cords in the correct order, then square the values, after squaring the values are added together, finally the number is square rooted and the outcome is printed
	public static void main(String[] args) {
		// distance equation outcome
		distance();

	}
	//stating as a final the cord values so it can be interchangeable
public static final int xcord1 = 31;
public static final int ycord1 = 15;
public static final int xcord2 = 35;
public static final int ycord2 = 9;
//goes through the equation to find the distance
	public static void distance() {
		double a = xcord2 - xcord1;
		double b = ycord2 - ycord1;
		double power1 = Math.pow(a, 2);
		double power2 = Math.pow(b, 2);
		double equal = power1 + power2;
		double rooted = Math.sqrt(equal);
		System.out.print("The distance from Baltimare to Manehattan is " + rooted);
		
	}

}
