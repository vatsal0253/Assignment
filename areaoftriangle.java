import java.util.Scanner;
public class areaoftriangle{
       public static void main(String args[]){
	double b,h,area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the base :");
	b = sc.nextDouble();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter the height :");
	h = sc2.nextDouble();
	
	area = 0.5*b*h ;
	System.out.println("area of triangle  : "+area);
	}
}