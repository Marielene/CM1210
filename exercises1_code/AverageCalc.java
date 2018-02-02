import java.util.Scanner;
public class AverageCalc{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Number of marks: ");
		float marks=in.nextFloat();
		int total=0;
		for(int i = 0; i < marks; ++i){
			System.out.print("Input mark " + i + " = ");
			int mark=in.nextInt();
			total+=mark;
		}
		float result=total/marks;
		System.out.print("Average mark equals " + result);
	}
}