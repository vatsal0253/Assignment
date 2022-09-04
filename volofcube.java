import java.util.Scanner;
public class volofcube{
       public static void main(String args[]){
	double s,volume;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the side :");
	s = sc.nextDouble();
	volume = (s*s*s);
	System.out.println("volume of cube : "+volume);
	}
}