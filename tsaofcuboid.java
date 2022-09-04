import java.util.Scanner;
public class tsaofcuboid{
       public static void main(String args[]){
	double l,b,h,tsa;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the lenght :");
	l = sc.nextDouble();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the breadth :");
	b = sc1.nextDouble();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter the height :");
	h = sc2.nextDouble();
	
	tsa = 2*l*b+2*l*h+2*b*h;
	System.out.println("tsa of cuboid  : "+tsa);
	}
}