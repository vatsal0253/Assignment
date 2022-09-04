import java.util.Scanner;
public class volofsphere{
       public static void main(String args[]){
	double r,pie = 3.14,volume;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius :");
	r = sc.nextDouble();
	volume = 1.333*pie*r*r*r;
	System.out.println("volume of sphere : "+volume);
	}
}