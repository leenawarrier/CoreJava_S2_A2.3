import java.util.Scanner;

//Class LargestNumber containing main()
public class LargestNumber {
	public static void main(String arg[]) {
		int x, y, z;
		System.out.println("Enter the three numbers :");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		largestofThree(x,y,z);
	}

//Method largestofThree using simple comparisions
public static void largestofThree(int f, int s, int t) {
	if (f>=s && f>= t)
		System.out.println("Largest is : "+f);
	else if (s>=f && s>=t)
		System.out.println("Largest is : "+s);
	else if (t>=s && t>=f)
		System.out.println("Largest is : "+t);
	else System.out.println("Largest is cannot be determined as values are not unique.");
}
}

