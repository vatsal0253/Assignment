import java.util.Scanner;
public class areaofrhombus{
       public static void main(String args[]){
	double p,q,area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the diagonal 1 :");
	p = sc.nextDouble();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter the diagonal 2 :");
	q = sc2.nextDouble();
	
	area = 0.5*p*q ;
	System.out.println("area of rhombus  : "+area);
	}
}