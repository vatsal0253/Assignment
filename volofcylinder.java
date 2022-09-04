import java.util.Scanner;
public class volofcylinder{
       public static void main(String args[]){
	double h,r,pie = 3.14,volume;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius :");
	r = sc.nextDouble();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the height :");
	h = sc1.nextDouble();
	
	volume = pie*r*r*h;
	System.out.println("volume of cylinder : "+volume);
	}
}