import java.util.Scanner;
public class volofhemisphere{
       public static void main(String args[]){
	double r,pie = 3.14,volume;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius :");
	r = sc.nextDouble();
	
	
	volume = 0.6666*pie*r*r*r;
	System.out.println("volume of hemisphere : "+volume);
	}
}