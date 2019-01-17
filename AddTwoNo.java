import java.util.Scanner;

class AddTwoNo {
	public static void main(String[] args) {
	
		int x,y,sum;

		Scanner cin = new Scanner(System.in);
		System.out.println("Enter no 1 : ");
		x = cin.nextInt();
		System.out.println("\nEnter no 2 : ");
		y = cin.nextInt();

		sum = x+y;

		System.out.println("\nSum is\t : "+ sum);

	}
}